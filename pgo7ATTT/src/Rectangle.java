public class Rectangle implements Figure{
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
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
