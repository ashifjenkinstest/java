package logics;

public class ClassExtendsAbstractClassImplementsInterface4MethDec extends AbstractClassImplementsInterface4MethDec{
    @Override
    public void B() {

        System.out.println("B " + this.getClass());
    }

    @Override
    public void C() {

        System.out.println("C "   + this.getClass());
    }

    @Override
    public void D() {
        System.out.println("D "   + this.getClass());
    }

    @Override
    public void E() {
        System.out.println("E " + this.getClass() );

    }


    public static void main(String afds[]){
        AbstractClassImplementsInterface4MethDec abstractClassImplementsInterface4MethDec = new ClassExtendsAbstractClassImplementsInterface4MethDec();
       // Interface4MethDec interface4MethDec = new ClassExtendsAbstractClassImplementsInterface4MethDec();


        abstractClassImplementsInterface4MethDec.A();
        abstractClassImplementsInterface4MethDec.B();
        abstractClassImplementsInterface4MethDec.C();
        abstractClassImplementsInterface4MethDec.D();
        abstractClassImplementsInterface4MethDec.E();

//
//        interface4MethDec.A();
//        interface4MethDec.B();
//        interface4MethDec.C();
//        interface4MethDec.D();

    }
}

