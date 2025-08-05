import java.lang.reflect.Array;
import java.util.Arrays;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private static int objectCounter;

    public Triangle() {
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
        objectCounter++;
    };

    public Triangle(double side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
        objectCounter++;
    };

    public Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        objectCounter++;
    }

    public Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        objectCounter++;
    }

    public Triangle(Triangle t) {
        this.sideA = t.sideA;
        this.sideB = t.sideB;
        this.sideC = t.sideC;
        objectCounter++;
    }

    public static int objectCount() {
        return objectCounter;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public boolean isRightAngled() {
        double a = sideA, b = sideB, c = sideC;
        double[] sides = { a, b, c };
        Arrays.sort(sides);
        double x = sides[0];
        double y = sides[1];
        double z = sides[2];
        return ((x * x + y * y) == (z * z));
    }

    @Override
    public String toString() {
        return "Triangle[sideA=" + sideA + ",sideB=" + sideB + ",sideC=" + sideC + "]";
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

}
