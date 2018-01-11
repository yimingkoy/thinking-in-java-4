//: initialization/OptionalTrailingArguments.java

public class OptionalTrailingArguments {
  // 以下这个函数有可选的尾随参数，可变参数列表在这种地方会很有用
  static void f(int required, String... trailing) {
    System.out.print("required: " + required + " ");
    for(String s : trailing)
      System.out.print(s + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    f(1, "one");
    f(2, "two", "three");
    f(0);
  }
} /* Output:
required: 1 one
required: 2 two three
required: 0
*///:~
