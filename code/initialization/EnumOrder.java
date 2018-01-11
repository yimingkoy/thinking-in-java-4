//: initialization/EnumOrder.java

public class EnumOrder {
  public static void main(String[] args) {
    // System.out.println(Spiciness.values());
    for(Spiciness s : Spiciness.values()){
      System.out.println(s + ", ordinal " + s.ordinal());
    }
  } 
} /* Output:
NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4
*///:~
