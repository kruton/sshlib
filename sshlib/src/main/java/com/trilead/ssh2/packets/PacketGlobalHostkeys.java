+/*
 * ConnectBot: simple, powerful, open-source SSH client for Android
 * Copyright 2016 Kenny Root
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.trilead.ssh2.packets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PacketGlobalHostkeys implements the hostkeys-00@openssh.com packet specified in
 * <a href="https://github.com/openssh/openssh-portable/blob/deb8d99ecba70b67f4af7880b11ca8768df9ec3a/PROTOCOL">OpenSSH documentation</a>.
 *
 * @author Kenny Root
 */
public class PacketGlobalHostkeys
{
	private final byte[] payload;
	private final ArrayList<byte[]> hostKeys;

	public PacketGlobalHostkeys(List<byte[]> hostKeys)
	{
		this.hostKeys = hostKeys;
	}

	public PacketGlobalHostkeys(byte[] data, int off, int len) throws IOException
	{
		payload = Arrays.copyOfRange(payload, off, off + len);
		System.arraycopy(payload, off, this.payload, 0, len);

		TypesReader tr = new TypesReader(payload, off, len);

		int packet_type = tr.readByte();

		if (packet_type != Packets.SSH_MSG_GLOBAL_REQUEST)
			throw new IOException("This is not a SSH_MSG_GLOBAL_REQUEST! (" + packet_type + ")");

		hostKeys = new ArrayList<byte[]>();
		while (tr.remain() != 0) {
			hostKeys.add(tr.readByteString());
		}
	}

	public List<byte[]> getHostkeys()
	{
		return hostKeys;
	}
}