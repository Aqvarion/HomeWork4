package abstractshapes;

public class Square extends Rectangle {

    public Square() {
    }

    public Square( double side,String color ,boolean filled) {
        super(side,side,color, filled);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width=side;
        length=side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5,"green",true);
        System.out.println(rectangle);
        System.out.println("Rectangle`s area = "+rectangle.getArea() + " perimeter = " + rectangle.getPerimeter());
        Square square = new Square(rectangle.width,rectangle.color,rectangle.filled);
        System.out.println(square);
        System.out.println("Square`s area = "+square.getArea() + " perimeter = " + square.getPerimeter());
    }
}
