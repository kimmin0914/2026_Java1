package ai0423;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("* 나이를 입력하세요: ");
        int score = s.nextInt();
        String result = "";

        if(score >= 19)
            result = "성인입니다";

        else
            result = "미성년자입니다.";

        System.out.println("* 당신은 " + result + "입니다.")
        ;
    }
}
