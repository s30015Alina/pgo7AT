public class Parallelogram implements Figure{
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
    double baseSide;
    double side;
    double height;

    public Parallelogram(double baseSide, double side, double height){
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }
}
