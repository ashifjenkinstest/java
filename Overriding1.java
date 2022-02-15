package logics;

public class Overriding1 {

    public Overriding1(){
        System.out.println("default constructor of Overriding1 ");
    }

    Overriding1(String str){
        System.out.println("Overriding1 " + str);
    }


    public void print(){
        System.out.println("From method print of Overriding1" );

    }


}
