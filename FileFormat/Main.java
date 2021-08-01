package FileFormat;

import java.util.StringTokenizer;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    // csv
    csv();
    
    // property
    propertyWrite();
    propertyRead();
 
  }

  // csv処理 ※ 実際は opencsv, OrangeSignal CSVを使うほうが良い
  public static void csv() {
    String s = "hoge,huga,aaa";
    StringTokenizer st = new StringTokenizer(s, ",");
    while (st.hasMoreTokens()) {
      String t = st.nextToken();
      System.out.println(t);
    }
  }

  // property Read
  public static void propertyRead() {
    try {
      Reader fr = new FileReader("./FileFormat/test.properties");
      Properties p = new Properties();
      p.load(fr);
      String name = p.getProperty("name");
      String type = p.getProperty("type");
      System.out.println("name: " + name + ", type: " + type);
    } catch (Exception e) {
      
    }
  }

  // property Write
  public static void propertyWrite() {
    try {
      Writer fw = new FileWriter("./FileFormat/test.properties");
      Properties p = new Properties();
      p.setProperty("name", "hoge");
      p.setProperty("type", "222");
      p.store(fw, "human");
      fw.close();
    }catch(Exception e) {

    }
  }
}
