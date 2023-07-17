package java동아리.빌더스위치연습;

public class BuilderClass {
    private String name;
    private Integer age;
    private String message;

    public BuilderClass(BuilderClassBuilder builder) {
        name = builder.name;
        message = builder.message;
        age = builder.age;
    }
    public static BuilderClassBuilder builder(String name) {
        return new BuilderClassBuilder(name);
    }


    // 정적 내부 클래스
    // 외부 클래스에 의존하지 않기 위해 정적 클래스로 선언(외부 객체를 생성하지 않아도 사용가능)
    public static class BuilderClassBuilder {
        private final String name;
        private Integer age;
        private String message = "";

        public BuilderClassBuilder(String name) {
            this.name = name;
        }

        public BuilderClassBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }
        public BuilderClassBuilder setMessage(String message) {
            this.message = message;
            return this;
        }
        public BuilderClass build() {
            return new BuilderClass(this);
        }
    }

    @Override
    public String toString() {
        return "내 이름은: " + name + "\n" +
                "내 나이는: " + age + "\n" +
                "메모: " + message + "\n";
    }

    public void printInfo() {
        System.out.println(
                "내 이름은: " + name + "\n" +
                "내 나이는: " + age + "\n" +
                "메모: " + message + "\n"
        );
    }

}
