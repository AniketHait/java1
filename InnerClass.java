package InnerClass;
class A {
    String name;

    public void display() {
        System.out.println("Display");
    }

    static class B {
        public void show() {
                System.out.println("Show");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();

      //  A.B obj1 = obj.new B();
      A.B obj1 = new A.B();
        obj1.show();
    }
}
