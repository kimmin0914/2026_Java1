package ai0319;

public class VariableTest2 {
    public static void main(String[] args) {
        int num1, num2, result, result2, result3;

        num1 = 300;
        num2 = 500;
        result = num1 + num2;
        result2 = num1 * num2;
        result3 = num1 / num2;
//        result = 10;

        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.printf("%d + %d = %d\n", num1, num2, result);
        System.out.printf("%d × %d = %d\n", num1, num2, result2);
        System.out.printf("%d ÷ %d = %d", num1, num2, result3);
        // 지역변수는 꼭 초기화 한당! 컨트롤 + 슬래쉬 하면 주석처리 한당!
        // 컨트롤 + 쉬프트 + 슬래쉬는 범위 주석처리당!
        // 정수 / 정수 = 0이당 실수로 나누도록 하장!
    }
}
