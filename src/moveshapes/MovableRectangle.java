package moveshapes;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed){
        topLeft = new MovablePoint(x1,y2,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft.x +"," + topLeft.y +
                ", bottomRight=" + bottomRight.x + "," + bottomRight.y +
                ", speed="+topLeft.xSpeed +","+topLeft.ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y+=topLeft.ySpeed;
        bottomRight.y+=bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y-=topLeft.ySpeed;
        bottomRight.y-=bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x-=topLeft.xSpeed;
        bottomRight.x-=bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x+=topLeft.xSpeed;
        bottomRight.x+=bottomRight.xSpeed;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(6,7,28,15);
        System.out.println("Point1 "+movablePoint1);
        MovablePoint movablePoint2 = new MovablePoint(8,10,28,15);
        System.out.println("Point2 "+movablePoint2);
        MovableRectangle movableRectangle = new MovableRectangle(movablePoint1.x,movablePoint1.y,movablePoint2.x,movablePoint2.y,movablePoint1.xSpeed,movablePoint1.ySpeed);
        System.out.println(movableRectangle);
        System.out.println("Circle move up and move right");
        movableRectangle.moveRight();
        movableRectangle.moveUp();
        System.out.println(movableRectangle);
    }
}
