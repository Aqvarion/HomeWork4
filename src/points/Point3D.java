package points;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z) {
        this.setXY(super.getXY()[0],super.getXY()[1]);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] XYZ = {this.getXY()[0],this.getXY()[1],this.z};
        return XYZ;
    }

    @Override
    public String toString() {
        return  "{" + super.getXY()[0]+
                "," + super.getXY()[1]+
                "," + z +
                "} " ;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0f,2.0f);
        System.out.println(point2D);
        Point3D point3D = new Point3D(point2D.getXY()[0], point2D.getXY()[1],4.0f);
        System.out.println(point3D);

    }
}
