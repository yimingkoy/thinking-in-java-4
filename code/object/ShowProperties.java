//: object/ShowProperties.java

public class ShowProperties {
  public static void main(String[] args) {
    // list() 方法将结果发给它的参数
    System.getProperties().list(System.out);
    System.out.println(System.getProperty("user.name"));
    System.out.println(System.getProperty("java.library.path"));
  }
} ///:~
