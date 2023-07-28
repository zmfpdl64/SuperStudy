package java동아리.아이템10;

import java.util.Objects;

public class PreferEquals {
    private String str;
    private int int1;
    private double double1;
    private float float1;
    private Double aDouble;
    @Override
    public boolean equals(Object obj) {

        // == 연산자를 사용해 입력이 자기 자신의 참조인지 확인한다.
        if(obj == this) return true;

        // instanceof 연산자로 입력이 올바른 타입인지 확인한다.
        if(!(obj instanceof PreferEquals)) return false;

        // 입력을 올바른 타입으로 변환한다.
        PreferEquals pe = (PreferEquals) obj;

        Objects.equals(obj, new Object());

        // 입력 객체와 자기 자신의 대응되는 '핵심' 필드들이 모두 일치하는지 하나씩 검사한다.
        return  this.str.equals(pe.str) &&
                this.int1 == pe.int1 &&
                Double.compare(this.double1, pe.double1) == 0 &&     // float, double은 부동소숫점 값 때문에 compare를 이용해 비교해야 한다.
                Float.compare(this.float1, pe.float1) == 0 &&
                aDouble.equals(pe.aDouble); // Wrapper 타입은 equals를 이용한다.
    }
}
