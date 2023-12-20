package org.example.ltm;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileOutputStream;

@Slf4j
public class Ex1 {
  public static void main(String[] args) {
    String readPathFile = "/home/kieukhiem/PTIT/LTM/src/main/java/org/example/ltm/ex1.txt";
    String writePathFile = "/home/kieukhiem/PTIT/LTM/src/main/java/org/example/ltm/ex1-write.txt";

    try (
          FileInputStream fis = new FileInputStream(readPathFile);
          FileOutputStream fos = new FileOutputStream(writePathFile)
    ) {
      byte[] data = new byte[1024];

      int count;

      while ((count = fis.read(data)) > 0) {
        log.info("{} bit has read", count);

        log.info(new String(data));

        fos.write(data);
      }
    } catch (Exception e) {
      log.error("Exception {} cause {}", e.getClass().getName(), e.getMessage());
    }
  }
}
