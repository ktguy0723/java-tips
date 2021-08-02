package Network;

import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) throws IOException {
    // URLクラスのインスタンス化
    URL url = new URL("https://qiita.com/api/v2/items");
    // データを取り出すストリームを取得
    InputStream is = url.openStream();
    // 文字ストリームに変換
    InputStreamReader isr = new InputStreamReader(is);
    // 1文字ずつ取得
    int i = isr.read();
    while (i != -1) {
      System.out.print((char) i);
      i = isr.read();
    }
    isr.close();
  }
}
