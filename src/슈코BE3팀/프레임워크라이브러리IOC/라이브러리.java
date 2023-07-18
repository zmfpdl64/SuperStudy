package 슈코BE3팀.프레임워크라이브러리IOC;

public class 라이브러리 {
    /**
     * 라이브러리란??
     */
    public static void main(String[] args) {
        int round = Math.round(10.5f);
        System.out.println(round(20.555d, 2));
        System.out.println(notUseLibrary(20.555d, 3));
    }
    // 2째 자리 반올림 라이브러리, 직접 구현
    public static <T> double round(T value, int decimalPoint) {
        Float aFloat = Float.valueOf(String.valueOf(value));
        double pow = Math.pow(10, decimalPoint);
        return Math.round(pow * aFloat) / pow;
    }

    public static <T> double notUseLibrary(T value, int decimalPoint){
        double dValue = Double.valueOf(String.valueOf(value));
        // Math.pow()
        double pow = 1;
        for(int i = 0; i < decimalPoint; i++) {
            pow *= 10;
        }
        dValue *= pow;

        // Math.round()
        double mod = dValue % 10;
        if( mod >= 5) {
            return (dValue+10-mod) / pow ;
        }
        return (dValue-mod)/pow;
    }

}
