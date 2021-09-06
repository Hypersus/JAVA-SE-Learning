---
title: Nested Class
---

Don't talk show me code:

```java
public class OuterClass {
    public int a = 1;
    int b = 2;
    private final int c = 3;
    private static final int d = 4;
    public OuterClass() {
        System.out.println("OuterClass no-arg constructor");
    }

    //Nested inner class
    class InnerClass{
        //InnnerClass no-arg constructor
        public InnerClass() {
            System.out.println("InnerClass no-arg constructor");
        }
        //non-static methods
        public void innerGo(){
            System.out.println("InnerClass public method");
        }
        private void innerPrigo(){
            System.out.println("InnerClass private method");
        }
        public void getA(){
            System.out.println("a="+a);
        }
        public void getB(){
            System.out.println("b="+b);
        }
        public void getC(){
            System.out.println("c="+c);
        }
        public void getD(){
            System.out.println("d="+d);
        }
        //static methods
//        public static void run(){
//          System.out.println("run");
//      }
    }
    //Static nested class
    static class StaticInnerClass{
        //Static nested class no-arg constructor
        public StaticInnerClass() {
            System.out.println("StaticInnerClass no-arg constructor");
        }
        //non-static methods
        public void staticInnerGo(){
            System.out.println("StaticInnerClass public method");
        }
        private void staticInnerpriGo(){
            System.out.println("StaticInnerClass private method");
        }
        public void getA(){
//            System.out.println("a="+a);
        }
        public void getB(){
//            System.out.println("b="+b);
        }
        public void getC(){
//            System.out.println("c="+c);
        }
        public void getD(){
            System.out.println("d="+d);
        }
        public static void staticGetd(){
            System.out.println("d="+d);
        }
    }
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Nested inner class test:");
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        System.out.println("---------------------------");
        innerClass.getA();
        innerClass.getB();
        innerClass.getC();
        innerClass.getD();
        System.out.println("Static nested class test:");
        //Static nested class constructor test
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        OuterClass.StaticInnerClass.staticGetd();
    }
}
```

## Nested inner class

- Non-static nested class is NOT allowed to have static fields or static methods
- Have full access to the members(either static or instance) of OuterClass
- Requires a reference of OuterClass to instantiate itself

## Static nested class

- Allowed to have both static and non-static fields and methods
- Can access the static fields of the OuterClass but can NOT access the instance fields
- Does NOT need a reference of OuterClass to instantiate itself