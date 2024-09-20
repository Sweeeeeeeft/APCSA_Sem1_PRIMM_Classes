import java.lang.Math;

class Circle {

    
    private double radius = 4.0;
    private double circumference = (2 * radius) * Math.PI;
    private double areas = (radius * radius) * Math.PI;

    public Circle (double r) {
        radius = r;
        circumference = (2 * radius) * Math.PI;
        areas = (radius * radius) * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getAreas() {
        return areas;
    }

    public void setRadius (double r) {
        radius = r;
        circumference = (2 * radius) * Math.PI;
        areas = (radius * radius) * Math.PI;
    }

}