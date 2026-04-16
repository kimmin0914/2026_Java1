package ai0326;

import java.util.Scanner;

public class BmiTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("====== 비만도 계산 ======\n");

        System.out.print("* 체중(kg, 실수값) 입력:");
        double weight = s.nextDouble();

        System.out.print("* 키(cm, 실수값) 입력:");
        double  height = s.nextDouble();

        double bmi = weight / Math.pow(height/100, 2);

        System.out.printf("* BMI 지수 결과: %.2f㎏/㎡", bmi);
        s.close();
    }
}
