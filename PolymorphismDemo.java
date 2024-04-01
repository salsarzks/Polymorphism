public class PolymorphismDemo {
    public static void main(String[] args) {
        RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
        Triangle BCD = new RightTriangle("BCD", 3.0, 4.0); // Using the superclass reference
        Triangle CDE = new Triangle("CDE", 3.0, 4.0);

        ABC.printSides();
        ABC.printHypotenuse(); // OK, ABC is a RightTriangle

        BCD.printSides(); // OK, BCD is a Triangle (polymorphism)
        // BCD.printPythagoras(); // Error, BCD is not a RightTriangle

        CDE.printSides(); // OK, CDE is a Triangle
        // CDE.printPythagoras(); // Error, CDE is not a RightTriangle
    }
}