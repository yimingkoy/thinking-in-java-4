//: operators/EqualsMethod2.java
// Default equals() does not compare contents.

class Value {
  int i = 0;

  public boolean equals(Object obj){
    // 这里推荐使用 getClass() 方法，而不推荐使用 instanceof 关键字
    // if(obj instanceof Value) {
    if(v.getClass() == this.getClass()){
      Value v = (Value) obj;
      if(this.i == v.i) {
        return true;
      }
    }
    return false; 
  }
}

public class EqualsMethod2 {
  public static void main(String[] args) {
    Value v1 = new Value();
    Value v2 = new Value();
    v1.i = v2.i = 100;
    // equals() 的默认行为是比较引用，我们需要在自己的类中重写 equals() 方法。
    System.out.println(v1.equals(v2));
  }
} /* Output:
false
*///:~
