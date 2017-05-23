package org.sunyata.octopus.example.client; /**
 * Created by leo on 17/4/14.
 */

import com.xt.yde.protobuf.common.Common;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.*;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * io.netty.handler.codec.http.websocketx.extension
 * Created by leo on 17/4/13.
 */
public final class WebSocketClient {

    static final String URL = System.getProperty("url", "ws://127.0.0.1:8000/websocket");
    private static AtomicLong serialCount = new AtomicLong();

    public static Channel connect() throws SSLException, URISyntaxException {
        URI uri = new URI(URL);
        String scheme = uri.getScheme() == null ? "ws" : uri.getScheme();
        final String host = uri.getHost() == null ? "127.0.0.1" : uri.getHost();
        final int port;
        if (uri.getPort() == -1) {
            if ("ws".equalsIgnoreCase(scheme)) {
                port = 80;
            } else if ("wss".equalsIgnoreCase(scheme)) {
                port = 443;
            } else {
                port = -1;
            }
        } else {
            port = uri.getPort();
        }

        if (!"ws".equalsIgnoreCase(scheme) && !"wss".equalsIgnoreCase(scheme)) {
            System.err.println("Only WS(S) is supported.");
            return null;
        }

        final boolean ssl = "wss".equalsIgnoreCase(scheme);
        final SslContext sslCtx;
        if (ssl) {
            sslCtx = SslContextBuilder.forClient()
                    .trustManager(InsecureTrustManagerFactory.INSTANCE).build();
        } else {
            sslCtx = null;
        }

        EventLoopGroup group = new NioEventLoopGroup();
        try {
            // Connect with V13 (RFC 6455 aka HyBi-17). You can change it to V08 or V00.
            // If you change it to V00, ping is not supported and remember to change
            // HttpResponseDecoder to WebSocketHttpResponseDecoder in the pipeline.
            final WebSocketClientHandler handler =
                    new WebSocketClientHandler(
                            WebSocketClientHandshakerFactory.newHandshaker(
                                    uri, WebSocketVersion.V13, null, true, new DefaultHttpHeaders()));

            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) {
                            ChannelPipeline p = ch.pipeline();
                            if (sslCtx != null) {
                                p.addLast(sslCtx.newHandler(ch.alloc(), host, port));
                            }
                            p.addLast(
                                    new HttpClientCodec(),
                                    new HttpObjectAggregator(8192),
                                    WebSocketClientCompressionHandler.INSTANCE,
                                    handler);
                        }
                    });

            Channel ch = b.connect(uri.getHost(), port).sync().channel();
            handler.handshakeFuture().sync();
            return ch;

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }

    public static void main(String[] args) throws Exception {
//        URI uri = new URI(URL);
//        String scheme = uri.getScheme() == null ? "ws" : uri.getScheme();
//        final String host = uri.getHost() == null ? "127.0.0.1" : uri.getHost();
//        final int port;
//        if (uri.getPort() == -1) {
//            if ("ws".equalsIgnoreCase(scheme)) {
//                port = 80;
//            } else if ("wss".equalsIgnoreCase(scheme)) {
//                port = 443;
//            } else {
//                port = -1;
//            }
//        } else {
//            port = uri.getPort();
//        }
//
//        if (!"ws".equalsIgnoreCase(scheme) && !"wss".equalsIgnoreCase(scheme)) {
//            System.err.println("Only WS(S) is supported.");
//            return;
//        }
//
//        final boolean ssl = "wss".equalsIgnoreCase(scheme);
//        final SslContext sslCtx;
//        if (ssl) {
//            sslCtx = SslContextBuilder.forClient()
//                    .trustManager(InsecureTrustManagerFactory.INSTANCE).build();
//        } else {
//            sslCtx = null;
//        }
//
//        EventLoopGroup group = new NioEventLoopGroup();
//        try {
//            // Connect with V13 (RFC 6455 aka HyBi-17). You can change it to V08 or V00.
//            // If you change it to V00, ping is not supported and remember to change
//            // HttpResponseDecoder to WebSocketHttpResponseDecoder in the pipeline.
//            final WebSocketClientHandler handler =
//                    new WebSocketClientHandler(
//                            WebSocketClientHandshakerFactory.newHandshaker(
//                                    uri, WebSocketVersion.V13, null, true, new DefaultHttpHeaders()));
//
//            Bootstrap b = new Bootstrap();
//            b.group(group)
//                    .channel(NioSocketChannel.class)
//                    .handler(new ChannelInitializer<SocketChannel>() {
//                        @Override
//                        protected void initChannel(SocketChannel ch) {
//                            ChannelPipeline p = ch.pipeline();
//                            if (sslCtx != null) {
//                                p.addLast(sslCtx.newHandler(ch.alloc(), host, port));
//                            }
//                            p.addLast(
//                                    new HttpClientCodec(),
//                                    new HttpObjectAggregator(8192),
//                                    WebSocketClientCompressionHandler.INSTANCE,
//                                    handler);
//                        }
//                    });
//
//            Channel ch = b.connect(uri.getHost(), port).sync().channel();
//            handler.handshakeFuture().sync();

        Channel ch = null;
        try {
            ch = connect();
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String msg = console.readLine();
                if (msg == null) {
                    break;
                } else if ("bye".equals(msg.toLowerCase())) {
                    ch.writeAndFlush(new CloseWebSocketFrame());
                    ch.closeFuture().sync();
                    break;

                } else if ("connect".equals(msg.toLowerCase())) {
//                    ch.writeAndFlush(new CloseWebSocketFrame());
//                    ch.closeFuture().sync();
                    ch = connect();
                } else if ("ping".equals(msg.toLowerCase())) {
                    WebSocketFrame frame = new PingWebSocketFrame(Unpooled.wrappedBuffer(new byte[]{8, 1, 8, 1}));
                    ch.writeAndFlush(frame);

                } else if ("login".equals(msg.toLowerCase())) {
                    Common.LoginRequestMsg.Builder builder = Common.LoginRequestMsg.newBuilder();
                    Common.LoginRequestMsg loginRequestMsg = builder.setPassword("lcl").setUserName("lcl").build();
                    ByteBuf buffer = Unpooled.buffer();
                    byte[] bytes = loginRequestMsg.toByteArray();
                    buffer.writeInt(10001).writeLong(2323232).writeFloat(1.0f).writeInt(bytes.length).writeBytes(bytes);
                    WebSocketFrame frame = new BinaryWebSocketFrame(buffer);
                    ch.writeAndFlush(frame);

                } else if ("bet".equals(msg.toLowerCase())) {
                    Common.BetRequestMsg.Builder builder = Common.BetRequestMsg.newBuilder();
                    Common.BetRequestMsg betRequestMsg = builder.setAmt(10).setGameType(1001).build();
                    ByteBuf buffer = Unpooled.buffer();
                    byte[] bytes = betRequestMsg.toByteArray();
                    buffer.writeInt(50002).writeLong(2323232).writeFloat(1.0f).writeInt(bytes.length).writeBytes(bytes);
                    WebSocketFrame frame = new BinaryWebSocketFrame(buffer);
                    ch.writeAndFlush(frame);
                } else {
//                    LoginReq.LoginRequest login = LoginReq.LoginRequest.getDefaultInstance().toBuilder().setPassword
//                            ("password").setUserName(msg).build();
//                    ByteBuf buffer = Unpooled.buffer();
//                    byte[] bytes = login.toByteArray();
//                    buffer.writeInt(1111).writeLong(2323232).writeFloat(1.0f).writeInt(bytes.length).writeBytes
// (bytes);
//                    WebSocketFrame frame = new BinaryWebSocketFrame(buffer);
//                    ch.writeAndFlush(frame);
                }
            }
        } finally

        {
            //group.shutdownGracefully();
        }
    }
}