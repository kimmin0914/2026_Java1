package ai0326;

import java.util.Calendar;
import java.util.Scanner;

public class AgeTest {
    public static void main(String[] args) {
        System.out.println("====== 나이 계산 ======");
        Scanner s = new Scanner(System.in);
        System.out.print("출생년도를 입력하세요.:");

        // 현재년도 구하기
        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(calendar.YEAR);
        int birthYear = s.nextInt();
        int age = nowYear - birthYear;

        System.out.println("당신의 현재 나이는 "+ age +"세 입니다.");
        s.close();
    }
}
