package File;

import java.io.*;
// ファイル読み書きについて
public class Main {
  public static void main(String[] args) throws IOException {
    // text file
    fileWriter();
    fileReader();

    // binary file
    fileOutputStream();
    fileInputStream();

    // use filter
    br();

    // ファイル自体の操作
    file();
  }
  
  // FileWriterの基本の流れ
  public static void fileWriter() {
    try (FileWriter fw = new FileWriter("./file.dat", false);) { // 初期化処理：true => 追記
      fw.write("test");
      fw.write("enter");
      fw.flush(); // 強制書き出し
    } catch (IOException e) {
      System.out.println(e);
    }
  }
  
  // FileReaderの基本の流れ
  public static void fileReader() {
    // この書き方だとcloseする必要ない
    try (FileReader fw = new FileReader("./file.dat");) {
      int i = fw.read();
      while (i != -1) {
        char c = (char) i;
        System.out.print(c);
        i = fw.read();
      }
      System.out.println();
    } catch (IOException e) {
      System.out.println(e);      
    }
  }

  // バイトストリーム
  public static void fileOutputStream() {
    FileOutputStream fos = null;
    try {
      fos = new FileOutputStream("test2.dat", true);
      fos.write(66);
      fos.flush();
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        fos.close();
      }catch(IOException e2){}
    }
  }

  // バイトストリーム
  public static void fileInputStream() {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("test2.dat");
      System.out.println(fis.read());
    } catch (IOException e) {
      System.out.println(e);
    } finally {
      try {
        fis.close();
      } catch (IOException e2) {
      }
    }
  }
  
  // 1行ずつの処理が可能 BufferedWriterなどもある
  public static void br() {
    try (FileReader fr = new FileReader("test2.dat");) {
      BufferedReader br = new BufferedReader(fr);
      String line = null;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void file() {
    File file = new File("test.dat");
    System.out.println(file.exists());
  }
}
