package naver_webtoon.annotation.meta;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUtils {
    public static void executeMethodsByRepeatAnnotation(Object object) {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getMethods();

        for(Method method: methods){
            Annotation[] annotations = method.getDeclaredAnnotations(); //메소드에 적용된 어노테이션 가져오기

            for(Annotation annotation: annotations) {
                if(annotation instanceof Repeat) {
                    Repeat repeatAnnotation = (Repeat) annotation;
                    int repeatCount = repeatAnnotation.value();

                    for(int i = 0; i < repeatCount; i++) {
                        try{
                            method.invoke(object);
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
