package ai0423;

import java.util.Scanner;

public class BmiTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("====== 비만도 계산 ======\n");

        System.out.print("* 체중(kg, 실수값) 입력:");
        double weight = s.nextDouble();

        System.out.print("* 키(cm, 실수값) 입력:");
        double  height = s.nextDouble();

        System.out.print("* 성명 입력: ");
        String name = s1.nextLine();

        double bmi = weight / Math.pow(height/100, 2);
        String result1, result2;

        if(bmi < 18.5){
            result1 = "저";
            result1 = "식이요법과 운동을 통해 체중을 증량시켜야 합니다. 생명에 위협이 있을 수 도 있습니다.";
        } else if (bmi < 22.9) {
            result1 = "정상";
            result1 = "현재 체중을 유지하시기 바랍니다.";
        } else if (bmi < 24.9) {
            result1 = "과";
            result1 = "식단과 운동을 통해 체중을 감량하시기 바랍니다.";
        }
        else if (bmi < 29.9) {
            result1 = "비만";
            result1 = "식단과 운동을 통해 체중을 감량하시기 바랍니다. 성인병 유발에 원인이 될 수 있습니다.";
        }
        else{
            result1 = "고도비만";
            result1 = "전문가의 도움을 받다 식단과 운동을 통해 체중을 반드시 감량하시기 바랍니다. 고혈아브 고지혈증, 당뇨병이 발생 될 수 있습니다.";
        }

        System.out.printf("* BMI 지수 결과: %.2f㎏/㎡", bmi, result1);

        s.close();
        s.close();
    }
}
