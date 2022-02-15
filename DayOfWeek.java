package logics;

public enum DayOfWeek {

    SUNDAY(0),
    MONDAY(100),
    TUESDAY(70),
    WEDNESDAY(50),
    THURSDAY(30),
    FRIDAY(10),
    SATURDAY(0);

    int difficulty;
    DayOfWeek(int difficulty){
        this.difficulty = difficulty;
    }
}
