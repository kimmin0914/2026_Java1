package ai0521.rabbit;

public class rabbit {

    private String shape; // 토끼의 모양
    private int xPos; // X 위치
    private int yPos; // Y 위치

    public rabbit() {
    }

    public rabbit(String shape) {
        this.shape = shape;
    }


    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    // 토끼 좌표(위치)값을 설정하는 메소드 구현
    public void setLocation(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
//    토끼의 모양, 위치 출력 메소드
    public void printInfo(){
        System.out.printf("%s 모양의 토끼는 (%d %d) 좌표에 위치하고 있다.\n", shape, xPos, yPos);
    }

//    x축으로 10씩 오른쪽으로 이동하는 메소드
    public void moverigthTen(){
        xPos += 10;
    }
//    x축으로 10씩 왼쪽으로 이동하는 메소드
    public void moveleftTen(){
        xPos -= 10;
    }
}
