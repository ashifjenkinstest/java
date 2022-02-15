package logics;

final class MyImmutableClass {

    private String name;
    private String age;

    public MyImmutableClass(String name , String age){

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
