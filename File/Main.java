package File;

import java.io.*;
// ファイル読み書きについて
public class Main {
  public static void main(String[] args) throws IOException{
    FileWriter fw = new FileWriter("./file.dat", true);
    fw.write('A');
    fw.flush();   // 強制書き出し
    fw.close();
  }
}
