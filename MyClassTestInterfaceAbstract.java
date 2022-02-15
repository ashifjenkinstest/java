package logics;

public class MyClassTestInterfaceAbstract extends MyAbstractClassN1{
    @Override
    public void a() {
        System.out.println("I am a");
    }

    @Override
    public void b() {
        System.out.println("I am b");
    }

    @Override
    public void d() {
        System.out.println("I am d");
    }

    public static void main(String safap[]){


        MyAbstractClassN1 abstractClassN1 = new MyClassTestInterfaceAbstract();
        abstractClassN1.a();
        abstractClassN1.b();
        abstractClassN1.c();
        abstractClassN1.d();
    }

}
