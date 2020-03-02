import java.util.concurrent.Callable;

public class TestShape {
    public static void main (String [] args){


        Triangle triangle1=new Triangle(2,2,4,6,6,4);
        System.out.println("Периметр треугольника "+triangle1.getPerimeter());
        System.out.println("Площадь треугольника "+triangle1.getArea());

        Triangle triangle2=new Triangle(3,4,6,8,12,78);
        System.out.println("Периметр треугольника "+triangle2.getPerimeter());
        System.out.println("Площадь треугольника "+triangle2.getArea());




        Rectangle rectangle1=new Rectangle(2,2,10,15);
        System.out.println("Периметр прямоугольника "+rectangle1.getPerimeter());
        System.out.println("Площадь прямоугольника "+rectangle1.getArea());

        Circle circle1=new Circle(3,6,10);
        System.out.println("Длинна окружности "+circle1.getPerimeter());
        System.out.println("Площадь круга "+circle1.getArea());





    }




}
