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
}
