package naver_webtoon.annotation.meta;

public class AnnotationTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        AnnotationUtils.executeMethodsByRepeatAnnotation(myClass);
    }
}
