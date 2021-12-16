package Lambda;

public class demo01 {
    interface Printer{
        void printer(String val);
    }
    interface Hello{
        void printer();
    }
    public void pringSomething(String some,Printer printer){
        printer.printer(some);
    }
    public static void main(String[]args){
        demo01 d1 = new demo01();
        String temp = "Hello Lambda!";
        Printer p1 = new Printer(){
            @Override
            public void printer(String val){
                System.out.println(val);
            }
        };
        Printer p2 = (String val)->{System.out.print(val);};
        Printer p3 = (val) -> System.out.println(val);
        Printer p4 = val ->{System.out.println(val);};
        Printer p5 = val ->System.out.println(val);
        Hello h = ()->System.out.println("Hello World!");
        h.printer();
        d1.pringSomething(temp, p3);
    }
}
