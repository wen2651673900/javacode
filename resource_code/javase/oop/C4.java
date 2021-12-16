package oop;

class A {
    public String show(D obj) {
        return ("oop.A and oop.D");
    }

    public String show(A obj) {
        return ("oop.A and oop.A");
    }

}

class B extends A{
    public String show(B obj){
        return ("oop.B and oop.B");
    }

    public String show(A obj){
        return ("oop.B and oop.A");
    }
}

class C extends B{

}

class D extends B{

}

public class C4 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println(c instanceof A);
        System.out.println("1--" + a1.show(b));
        System.out.println("2--" + a1.show(c));//没有c对象的参数所以a and a
        System.out.println("3--" + a1.show(d));//有d对象的参数所以d and a
        System.out.println("4--" + a2.show(b));//a2向下转型，但是呢a2没有参数是b的但有a的呀然后子类有重写了它所以调用的是子类重写的show
        System.out.println("5--" + a2.show(c));
        System.out.println("6--" + a2.show(d));
        System.out.println("7--" + b.show(b));
        System.out.println("8--" + b.show(c));
        System.out.println("9--" + b.show(d));
    }
}