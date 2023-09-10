package dt;

public enum DaysInWeek {
    MON("Mondat"),
    TUE("Tueseday"),
    WWD("Wenesday"),
    THU("Thersday"),
    FRI("Friday"),
    SAT("Saterday"),
    SUN("Sunday");

    public final String dayName;

    DaysInWeek(String dayName){
        this.dayName = dayName;
    }

    public String toString(){
        return this.dayName;
    }
}
