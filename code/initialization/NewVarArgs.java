//: initialization/NewVarArgs.java
// Using array syntax to create variable argument lists.

public class NewVarArgs {
  static void printArray(Object... args) {
    for(Object obj : args)
      System.out.print(obj + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    // Can take individual elements:
    int[] test;
    test = new int[2];
    // for(int i = 0; i < test.length; i++){
      // System.out.println(test[i]);
    // }
    // 编译器实际上会去填充数组
    printArray(new Integer(47), new Float(3.14),
      new Double(11.11));
    printArray(47, 3.14F, 11.11);
    printArray("one", "two", "three");
    // printArray(new A(), new A(), new A());
    // Or an array:
    // 编译器会发现这已经是一个数组了，所以不会在其上执行转换操作
    printArray((Object[])new Integer[]{ 1, 2, 3, 4 });
    //空数组也是可以的
    printArray(); // Empty list is OK
  }
} /* Output: (75% match)
47 3.14 11.11
47 3.14 11.11
one two three
A@1bab50a A@c3c749 A@150bd4d
1 2 3 4
*///:~
