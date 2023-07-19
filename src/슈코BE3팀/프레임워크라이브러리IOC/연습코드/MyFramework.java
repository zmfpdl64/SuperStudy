package 슈코BE3팀.프레임워크라이브러리IOC.연습코드;

import java.util.HashMap;
import java.util.Map;

public class MyFramework {
    private Map<Class<?>, Object> container;

    public MyFramework() {
        container = new HashMap<>();
    }

    public void register(Class<?> clazz, Object instance) {
        container.put(clazz, instance);
    }

    // 캐싱된 객체 가져오기 재사용성 증가
    public <T> T resolve(Class<T> clazz) {
        Object instance = container.get(clazz);
        if (instance == null) {
            throw new RuntimeException("No registration found for " + clazz.getName());
        }
        return clazz.cast(instance);
    }
}
