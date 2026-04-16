package ai0326;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("출생년도를 입력하세요.:");
        int num = s.nextInt();
        int num2 = 2026;

        System.out.println("나이는 "+ num +"입니다.");
        s.close();
    }
}
