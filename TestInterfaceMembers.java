package logics;

public class TestInterfaceMembers implements TestableInterfaceMembers
{

    public static  void main(String arg[]){

        TestableInterfaceMembers TestInterfaceMembers = new TestInterfaceMembers();
        TestInterfaceMembers.printVal();
    }

    @Override
    public void printVal() {
        int val = TestInterfaceMembers.val ;
        System.out.println(val);
        System.out.println( TestInterfaceMembers.val );
    }
}
