//: operators/EqualsMethod.java

public class EqualsMethod {
  public static void main(String[] args) {
    Integer n1 = new Integer(47);
    Integer n2 = new Integer(47);
    // 比较两个内容的实际内容是否相同
    // 这个方法不适用于基本类型，基本类型可以用 == 和 !=
    System.out.println(n1.equals(n2));
  }
} /* Output:
true
*///:~
