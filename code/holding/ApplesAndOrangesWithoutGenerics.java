//: holding/ApplesAndOrangesWithoutGenerics.java
// Simple container example (produces compiler warnings).
// {ThrowsException}
import java.util.*;

class Apple {
  private static long counter;
  private final long id = counter++;
  public long id() { return id; }
}

class Orange {}	

public class ApplesAndOrangesWithoutGenerics {
  // 如果不加注解，会报下面这个警告.\ApplesAndOrangesWithoutGenerics.java使用了未经检查或不安全的操作。
  // 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
  // 使用这个参数进行编译，会得到详细的警告信息：警告: [unchecked] 对作为原始类型ArrayList的成员的add(E)的调用未经过检查
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    ArrayList apples = new ArrayList();
    for(int i = 0; i < 3; i++)
      apples.add(new Apple());
    // Not prevented from adding an Orange to apples:
    apples.add(new Orange());
    for(int i = 0; i < apples.size(); i++)
      ((Apple)apples.get(i)).id();
      // 强制转换会失败，Orange -> Apple
      // Orange is detected only at run time
  }
} /* (Execute to see output) *///:~
