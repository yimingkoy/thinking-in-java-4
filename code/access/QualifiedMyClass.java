//: access/QualifiedMyClass.java

// javac .\QualifiedMyClass.java .\mypackage\*.java
// javac .\access\QualifiedMyClass.java .\access\mypackage\*.java
public class QualifiedMyClass {
  public static void main(String[] args) {
    access.mypackage.MyClass m = new access.mypackage.MyClass();
  }
} ///:~
