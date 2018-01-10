//: operators/Precedence.java

public class Precedence {
  public static void main(String[] args) {
    int x = 1, y = 2, z = 3;
    int a = x + y - 2/2 + z;           // (1)
    int b = x + (y - 2)/(2 + z);       // (2)
    // 字符串连接和字符串转换
    // 当编译器观察到一个 String 后面紧跟一个 “+” 而这个 “+” 的后面又紧跟一个非 String 类型的元素时，就会尝试讲这个非 String 类型的元素转换为 String。
    System.out.println("a = " + a + " b = " + b);
  }
} /* Output:
a = 5 b = 1
*///:~
