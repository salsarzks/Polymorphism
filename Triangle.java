public class Triangle {
    private String name;
    private double side1, side2, side3;

    public Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String name, double side1, double side2) {
        this(name, side1, side2, 0.0); // Call the other constructor with a default value for side3
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getName() {
        return name;
    }

    public void printSides() {
        System.out.println("Triangle " + name + ":" + side1 + "," + side2 + "," + side3);
    }
}

class RightTriangle extends Triangle {
    public RightTriangle(String name, double side1, double side2) {
        super(name, side1, side2);
    }

    public void printHypotenuse() {
        double hypotenuse = Math.sqrt(getSide1() * getSide1() + getSide2() * getSide2());
        System.out.println("Hypotenuse of Triangle " + getName() + " = " + hypotenuse);
    }
}