package ai0611.abstracttest;

public class RunPerson {
    public static void main(String[] args) {
//        추상(abstract) 클래스는 new 연산자로 객체 생성 불가능하다.
//        Person person = new Person();
        Men men = new Men();
        men.name = "민준킴";
        men.weight = 77;
        men.height = 181;

        Women women = new Women();
        women.name = "박인순";
        women.weight = 48;
        men.height = 170;

        men.eat("김치찌개");
        men.study();
        men.sleep(8);

        women.eat("어제의 카레");
        women.study();
        women.sleep(10);
    }
}
