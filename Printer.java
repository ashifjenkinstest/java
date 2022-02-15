package logics;

public class Printer implements  Printable{

    private String str;

    Printer(){

    }

     Printer(String str){

        this.str = str;
    }

    @Override
    public void print() {
        System.out.println(this.str);
    }
}
