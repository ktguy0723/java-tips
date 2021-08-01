package String;

public class Main {
  public static void main(String[] args) {
    
    String s1 = "test";
    String s2 = "Test";
    // 調査
    // 内容が等しいかどうか調べる
    System.out.println(s1.equals(s2)); // false
    // 大文字小文字を区別せず等しいか調べる
    System.out.println(s1.equalsIgnoreCase(s2)); // true
    // 文字列の長さ
    System.out.println(s1.length()); // 4
    // 空文字かどうか
    System.out.println(s1.isEmpty()); // false

    // 検索
    // 一部に含まれているか
    System.out.println(s1.contains("tes")); // true
    // 指定文字列から始まるか
    System.out.println(s1.startsWith("te")); // true
    // 指定文字で終わるか
    System.out.println(s1.endsWith("est")); // true
    // 最初に登場する位置
    System.out.println(s1.indexOf('s')); // 2
    // 最後に登場する位置
    System.out.println(s1.lastIndexOf('t')); // 3

    // 切り出す
    // 大文字 => 小文字
  }
}