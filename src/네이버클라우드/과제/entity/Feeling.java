package 네이버클라우드.과제.entity;

public enum Feeling {
    HAPPY("기쁨니"),
    SOSO("평범합니"),
    NOT_BAD("그럭저럭입니"),
    BAD("조금 안좋습니"),
    TERRIBLE("기분 나쁩니");
    final private String description;

    Feeling(String description) {
        this.description = description;
    }
}
