package logics;

public class Overriding2 extends Overriding1{

    public Overriding2(){
       // super();
        //System.out.println("default constructor of Overriding2 ");
    }

    Overriding2(String str){
        System.out.println("Overriding1 " + str);
    }


    public void print(){
        super.print();
        System.out.println("From method print of Overriding2" );

    }


    public static void main(String sdfs[]){
        Overriding2 overriding2 = new Overriding2();
        //overriding2.print();



    }
}
