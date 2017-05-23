/**
 * Copyright 2012 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sunyata.octopus.store.pubsub;

public class DispatchMessage extends PubSubMessage {

    private static final long serialVersionUID = 6692047718303934349L;

    private String room;
    private String namespace;
    private Object packet;

    public DispatchMessage() {
    }

    public DispatchMessage(String room, Object packet, String namespace) {
        this.room = room;
        this.packet = packet;
        this.namespace = namespace;
    }

    public String getNamespace() {
        return namespace;
    }

    public Object getPacket() {
        return packet;
    }

    public String getRoom() {
        return room;
    }

}
