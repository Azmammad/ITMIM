package Task3_GeometricFigures;

public class Triangle extends Shape{
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    public Triangle(double firstSide,double secondSide,double thirdSide){
        this.firstSide=firstSide;
        this.secondSide=secondSide;
        this.thirdSide=thirdSide;
    }
    //TODO:yuvarlaqlasdir
    @Override
    public double getArea() {
        return Math.sqrt(halfPerimeter()*(halfPerimeter()-firstSide)*(halfPerimeter()-secondSide)*(halfPerimeter()-thirdSide)) ;
    }

    @Override
    public double getPerimeter() {
        return firstSide+secondSide+thirdSide;
    }
    public  double halfPerimeter(){
        return getPerimeter()/2;
    }
}
