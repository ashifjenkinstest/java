package logics;

public class TestPrinter {

    public static void main(String asfasdp[]){

        Printer printer = new Printer("This is from printer class");
        Printable printable = new Printer("This is from printer interface");

        testPrinterFunc(printer);
        testPrinterFunc(printable);
        testPrinterFunc(()->System.out.println("I am printing from Lambda"));

    }


    static void testPrinterFunc(Printable printable){
        printable.print();
    }
}
