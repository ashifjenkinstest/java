package logics;

public interface FucnInterface2 {
    void print();
    public default void intrfc(){
        System.out.println("FucnInterface2 intrfc");
    }
}
