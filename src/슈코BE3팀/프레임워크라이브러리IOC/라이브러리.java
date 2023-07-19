package 슈코BE3팀.프레임워크라이브러리IOC;

public class 라이브러리 {
    /**
     * 라이브러리란??
     * 재사용이 가능한 코드의 집합
     * 장점:
     * 1. 가독성이 좋다
     * 2. 안정성도 좋다(겸증됨)
     * 3. 생산성 향상
     * 4.
     */
    public static void main(String[] args) {

        double library_time = System.nanoTime();
        double library = round(20.555d, 2);
        double library_endTime = System.nanoTime();

        double custom_time = System.nanoTime();
        double custom = notUseLibrary(20.555d, 2);
        double custom_endtime = System.nanoTime();

        System.out.println("라이브러리: " + library + " 걸린시간: " + (library_endTime-library_time));
        System.out.println("커스텀: " + custom + " 걸린시간: " + (custom_endtime - custom_time));
    }

    // 2째 자리 반올림 라이브러리, 직접 구현
    public static <T> double round(T value, int decimalPoint) { // 5줄
        Float aFloat = Float.valueOf(String.valueOf(value));
        double pow = Math.pow(10, decimalPoint);
        return Math.round(pow * aFloat) / pow;
    }

    public static <T> double notUseLibrary(T value, int decimalPoint){ // 15줄
        double dValue = Double.valueOf(String.valueOf(value));
        // Math.pow() 와 같은 행위
        double pow = 1;
        for(int i = 0; i <= decimalPoint; i++) {
            pow *= 10;
        }
        dValue *= pow;
        // Math.round() 와 같은 행위
        double mod = dValue % 10;
        if( mod >= 5) {
            return (dValue+-mod+10) / pow ;
        }
        return (dValue-mod)/pow;
    }

}
