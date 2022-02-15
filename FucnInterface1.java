package logics;

public interface FucnInterface1 {

    void print();


    public default void intrfc(){
        System.out.println("FucnInterface1 intrfc");
    }
}
