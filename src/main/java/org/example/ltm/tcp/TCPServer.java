package org.example.ltm.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(1980);

    System.out.println("Server running");

    while (true) {
      Socket connection = serverSocket.accept();

      System.out.println(connection);

      //nhan du lieu
      DataInputStream dataInputStream = new DataInputStream(connection.getInputStream());

      int a = dataInputStream.readInt();

      System.out.println(a);
      //gui du lieu

      connection.close();
    }
  }
}
