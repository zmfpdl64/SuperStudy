package 네이버클라우드.day4;

public class StaticClass {
    public static class Static {
        private final String name = "name";

    }
    public static Static createStatic() {
        return new Static();
    }
}
