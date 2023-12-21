package org.example.ltm.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {
  public static void main(String[] args) throws IOException {
    Socket client = new Socket("localhost",1980);

    //gui du lieu
    DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());

    dataOutputStream.writeInt(100);

    dataOutputStream.close();

    System.out.println(client);
  }
}
