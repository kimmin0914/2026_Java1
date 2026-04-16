package ai0409;

// 기본 자료형 연습(1. 숫자형과 2. 숫자가 아닌형)
public class DataTypeTest {
    public static void main(String[] args) {
        // 숫자형
        byte bt = -128; // -128 ~ 127
        short st = 300;
        //bt = st; // 크기가 안 맞아 불가능
        st = bt; // 크기가 맞아 가능
        int it = st;
        System.out.println("it 변수에 지정된 값: " + it);
        long lg = 70000000;
        //1. 숫자형: 실수형
        float f1 = 1000;
        f1 = lg;
        f1 = 1000.0f; // 소문자 입력 가능
        f1 = 1000.0F; // 대문자 입력 가능
        f1 = (float) 1000.0; // 형 변환

        double d1 = 20000;
        d1 = f1;
        d1 = bt;
        d1 = 207.999;

        //2. 숫자가 아닌 자료형: 문자형
        char c = 'A';
        System.out.println((char)(c+1)); // unicode 값을 연산할 수 있다.
        System.out.println((int)c); // unicode 값은 정수형으로 바꾸면 알 수 있다.

        // 2. 숫자가 아닌 자료형: 논리형
        boolean b = true;

        System.out.println(b);
        System.out.println(!b);

        System.out.println(bt == st);

    }
}
