package logics;

@FunctionalInterface
public interface FuncInterface2 extends FuncInterface1{

    public void func();


    public default  void func2(){

    }
}
