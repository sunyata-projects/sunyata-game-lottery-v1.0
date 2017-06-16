package org.sunyata.spring.thrift.client.pool;

import org.apache.commons.pool2.KeyedPooledObjectFactory;
import org.apache.commons.pool2.impl.GenericKeyedObjectPool;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;
import org.apache.thrift.TServiceClient;

/**
 * Created by aleksandr on 03.08.15.
 */
public class ThriftClientPool extends GenericKeyedObjectPool<ThriftClientKey, TServiceClient> {
    public ThriftClientPool(KeyedPooledObjectFactory<ThriftClientKey, TServiceClient> factory, GenericKeyedObjectPoolConfig config) {
        super(factory, config);
    }
}
