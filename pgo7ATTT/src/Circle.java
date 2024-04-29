public class Circle implements Figure {
    @Override
    public double getPerimetr() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
}
