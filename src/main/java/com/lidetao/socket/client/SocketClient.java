package com.lidetao.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

	public static void main(String[] args) {
		Socket socket = null;
		try {

			for (int i = 0; i < 10; i++) {
				socket = new Socket("127.0.0.1", 7733);
				socket.setKeepAlive(false);

				OutputStream os = socket.getOutputStream();

				PrintWriter writer = new PrintWriter(os);
				writer.println(System.currentTimeMillis() + "|getInfo|ldt,35;");
				writer.flush();

				// 读取消息
				InputStream is = socket.getInputStream();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(is));

				StringBuilder sb = new StringBuilder("收到消息：");
				String line = null;
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}

				System.out.println(sb.toString());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
