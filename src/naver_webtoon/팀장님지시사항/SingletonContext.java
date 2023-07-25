package naver_webtoon.팀장님지시사항;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class SingletonContext {

    private static SingletonConfig config;
    private static Map<String, Method> singletonMap = new HashMap<>();
    private static Map<String, Object> singletonObjectMap = new HashMap<>();

    public static void setConfig(SingletonConfig config) {
        SingletonContext.config = config;
    }

    static synchronized Object getSingleton(String name) {
        if(singletonObjectMap.containsKey(name)){
            return singletonObjectMap.get(name);
        }
        return new Object();
    }

    public static void executeMethodsBySingletonAnnotation(Object object) {
        // TODO - 1: Object 가 들어 오면 해당 클래스의 Method를 돌면서, @Singleton annotation을 발견합니다.
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getMethods();

        for(Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();

            for(Annotation annotation : annotations) {

                if(annotation instanceof Singleton) {
                    Singleton singleton = (Singleton) annotation;
                    String annotationName = singleton.name();

                    try {
                        Object obj = method.invoke(object);
                        singletonObjectMap.put(annotationName, obj);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }

                    singletonMap.put(annotationName, method);
                }
            }
        }
        // TODO - 2: 해당 Annotation의 name 과 method를 적당한 Map에 저장합니다.
    }

}