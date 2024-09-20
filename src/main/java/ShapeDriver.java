/**
 * Driver class for the shapes
 * @author
 * @version 1.0
 * @since 2024-09
 */


class ShapeDriver {
    public static void main(String args[]) {

        Square sq1 = new Square(1.0);
        Circle circ1 = new Circle(1.0);

        System.out.printf("Side: %.2f\n", sq1.getSide());
        // Print out perimeter, area
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());


        // Change the side length
        sq1.setSide(3.0);
        // Print out side length, perimeter, area
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());
        

        sq1.setPerimeter(16.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());
        

        sq1.setArea(25.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());
   

        sq1.setSide(4.5);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());


        circ1.setRadius(5.0);
        System.out.printf("Radius: %.2f\n", circ1.getRadius());
        System.out.printf("Circumference: %.2f\n", circ1.getCircumference());
        System.out.printf("Area: %.2f\n", circ1.getAreas());


    }


}