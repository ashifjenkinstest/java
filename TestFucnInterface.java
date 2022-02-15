package logics;

public class TestFucnInterface implements FucnInterface1, FucnInterface2{


    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void intrfc() {
        FucnInterface1.super.intrfc();
        FucnInterface2.super.intrfc();
    }

    public static void main(String asdfsdp[]){
        TestFucnInterface testFucnInterface = new TestFucnInterface();
        testFucnInterface.intrfc();


    }
}
