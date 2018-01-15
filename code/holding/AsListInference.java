//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.
import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(
      new Crusty(), new Slush(), new Powder());
    //  List<Snow> snow5 = Arrays.asList(
      // new Crusty(), new Slush(), new Powder(), new Light());
    // Won't compile:
    // 因为全部都是 Powder类型的，所以 Arrays.asList 会创建一个 List<Power> 而不是 List<Snow>
    // List<Snow> snow2 = Arrays.asList(
    //   new Light(), new Heavy());
    // Compiler says:
    // found   : java.util.List<Powder>
    // required: java.util.List<Snow>

    // Collections.addAll() doesn't get confused:
    List<Snow> snow3 = new ArrayList<Snow>();
    Collections.addAll(snow3, new Light(), new Heavy());

    // Give a hint using an
    // explicit type argument specification:
    List<Snow> snow4 = Arrays.<Snow>asList(
       new Light(), new Heavy());
    List<Snow> snow6 = Arrays.<Snow>asList(
       new Light(), new Heavy()
    );
    int[] a = {5,2,3,1};
    Arrays.sort(a);
    for(int x : a) {
      System.out.println(x);
    }
    System.out.println(Arrays.toString(a));
    // System.out.println(a.toString());
  }
} ///:~
