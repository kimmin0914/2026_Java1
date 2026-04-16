package ai0402;

import java.util.Scanner;

public class KgTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("========== 파운드/킬로그램 단위 변환기 ========== ");
        double lb = 0.453592;
        double kg = 2.204623;
        double result = 0;

        System.out.print("파운드(lb) 값 입력. : ");
        int input1 = s.nextInt();
        result = input1 * lb;
        System.out.printf("%d 파운드(lb)는 %.3f킬로그램(kg)입니다.\n", input1, result);

        System.out.print("킬로그램(kg) 값 입력. : ");
        int input2 = s.nextInt();
        result = input2 * kg;
        System.out.printf("%d 킬로그램(kg)는 %.3f파운드(lb)입니다.\n", input2, result);

        s.close();


    }
}
