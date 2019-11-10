package points;


public class MovablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float speed[] = {xSpeed,ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return  super.toString() +"speed=" + "{" +
                xSpeed + "," +
                ySpeed +"}";

    }

    public MovablePoint move(){
        this.setXY(this.getXY()[0]+xSpeed,this.getXY()[1]+ySpeed);
        return this;
    }

    public static void main(String[] args) {
        Point2D point = new Point2D(6.0f,7.0f);
        System.out.println("Point: "+point);
        MovablePoint movablePoint = new MovablePoint(point.getXY()[0],point.getXY()[1],30,40);
        System.out.println("Movable point: "+movablePoint);
        System.out.println("Moving");
        movablePoint.move();
        System.out.println("Movable point: "+movablePoint);
    }
}
