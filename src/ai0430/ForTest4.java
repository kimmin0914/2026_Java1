package ai0430;

public class ForTest4 {
    public static void main(String[] args) {
        System.out.println("==== 1001 ~ 2000까지의 홀수의 합");
        int hap = 0;

        for (int i = 1001; i < 2000; i+=2)
        {
            if (i % 2 != 0)
             hap += i;
        }
        System.out.println(hap);
    }
}
