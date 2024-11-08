
public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public double getArea() {
        return this.radius * 3.14;
    }
    public String toString(){
        return  "\n-------------------" +"\nRadius: " + this.radius + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea() + "\n-------------------";
        
    }
}
