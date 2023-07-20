package snow.day4.사수도움요청;

import snow.day4.사수도움요청.exception.DivideByZeroException;
import snow.day4.사수도움요청.exception.InvalidOperatorException;

import java.util.Objects;

public class Calculator {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num1;
        int num2;
        char operand;
        try {
            // 숫자1 입력
            num1 = 0;
            // 숫자2 입력
            num2 = 10;
            // 연산자 입력
            operand = '/';
            // calculate 메소드 호출
            int result = calculate(num1, num2, operand);
            // 결과 출력
            System.out.println(result);
            System.out.println("정상 출력");

        } catch (DivideByZeroException | InvalidOperatorException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }
    }

    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        // 사칙연산 수행 및 예외 처리
        switch (Objects.requireNonNull(Operand.getOperand(operator))) {
            case ADD:
                return num1 + num2;
            case SUB:
                return num1 - num2;
            case MUL:
                return num1 * num2;
            case DIV:
                return div(num1, num2);
            default:
                throw new InvalidOperatorException("잘못된 연산자가 들어왔습니다.");
        }
    }

    private static int div(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            throw new DivideByZeroException("0으로 나눌 수 없습니다.");
        }
        return num1 / num2;
    }
}