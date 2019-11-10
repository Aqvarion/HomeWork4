package resizableshapes;

public class ResizableCircle extends Circle implements Resizable  {


    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius+=radius*percent/100;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println(circle);
        System.out.println("Circle`s perimeter = "+circle.getPerimeter()+" Area = "+circle.getArea());
        ResizableCircle resizableCircle = new ResizableCircle(circle.radius);
        resizableCircle.resize(30);
        System.out.println(resizableCircle);
        System.out.println("Resizable circle`s perimeter = "+resizableCircle.getPerimeter()+" Area = "+resizableCircle.getArea());
    }
}
