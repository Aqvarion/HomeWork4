package moveshapes;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
        center= new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.y+=center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y-=center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x+=center.xSpeed;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2,3,40,50);
        System.out.println("Point "+movablePoint);
        System.out.println("Point move up and move left");
        movablePoint.moveUp();
        movablePoint.moveLeft();
        System.out.println("Point "+movablePoint);
        MovableCircle movableCircle = new MovableCircle(movablePoint.x,movablePoint.y,movablePoint.xSpeed,movablePoint.ySpeed,30);
        System.out.println(movableCircle);
        System.out.println("Circle move up and move right");
        movableCircle.moveUp();
        movableCircle.moveRight();
        System.out.println(movableCircle);
    }


}
