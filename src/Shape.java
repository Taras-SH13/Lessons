
    public class Shape{
        double ax,ay,az,bx,by,bz,cx,cy,cz; // The coordinates of the vertices of any shapes
        double Pi=3.14159;
        public double distance (double x1, double x2, double y1, double y2){
            return Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        }
    }
    interface PerimeterMeasurable {
        double getPerimeter();
    }
    interface AreaMeasurable {
        double getArea();
    }
    interface VolumeMeasurable {
        double getVolume();
    }
    class PlaneShape extends Shape implements PerimeterMeasurable,AreaMeasurable {

        /*public double distance (double x1, double x2, double y1, double y2){
            return Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        }*/

        @Override
        public double getPerimeter() {
            return 0;
        }

        @Override

        public double getArea() {
            return 0;
        }
    }
    class Triangle extends PlaneShape {
        public Triangle(double ax, double ay, double bx, double by, double cx, double cy) { //Конструктор треугольников
            super.ax = ax;
            super.ay = ay;
            super.bx = bx;
            super.by = by;
            super.cx = cx;
            super.cy = cy;
            System.out.println("Треугольник создан!");
        }

       @Override
        public double getPerimeter() {
            return distance(ax, bx, ay, by) + distance(ax, cx, ay, cy) + distance(bx, cx, by, cy);

        }

        @Override
        public double getArea() {
            double p=getPerimeter()/2;
            return Math.sqrt(p*(p-distance(ax, bx, ay, by))*(p-distance(ax, cx, ay, cy))*(p-distance(bx, cx, by, cy)));
        }
    }
class Rectangle extends PlaneShape {
    double width, height;

    public Rectangle(double ax, double ay, double width, double height) {
        super.ax = ax;
        super.ay = ay;
        this.width = width;
        this.height = height;
        super.bx = ax;
        super.by = ay + height;
        super.cx = ax + width;
        super.cy = ay + height;
        System.out.println("Прямоугольник создан!");
    }

    @Override
    public double getPerimeter() {
        return (distance(ax,bx,ay,by)*2)+(distance(bx,cx,by,cy)*2);
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
    class Circle extends PlaneShape{
        double radius;

        public Circle(double ax, double ay,double radius){
            super.ax = ax;
            super.ay = ay;
            this.radius=radius;
            System.out.println("Окружность создана!");
        }

        @Override
        public double getPerimeter() {
            return super.Pi*2*radius;
        }

        @Override
        public double getArea() {
            return Pi*radius*radius;
        }
    }
    class SpaceShape extends Shape implements AreaMeasurable,VolumeMeasurable{

        @Override
        public double getArea() {
            return 0;
        }

        @Override
        public double getVolume() {
            return 0;
        }
    }
    class SquarePyramid extends SpaceShape{
    double base_width,pyramid_height;
    public SquarePyramid(double ax, double ay, double az,double base_width,double pyramid_height){
        super.ax=ax;
        super.ay=ay;
        super.az=az;
        this.base_width=base_width;
        this.pyramid_height=pyramid_height;

    }
    }
















