package logics;

public class MySingletonClass {

    private static MySingletonClass mySingletonClass;

    public String s;

    private  MySingletonClass(){
        s = "Assigne from the private constructor";
    }


     static MySingletonClass getMySingletonClass(){
        if(mySingletonClass == null){
            mySingletonClass = new MySingletonClass();
            return  mySingletonClass;
        }else
            return mySingletonClass;

    }

}
