package snow.day4.enum_practice;

public enum Day {
    SUNDAY("일요일"),
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WENDESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일");
    final private String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
