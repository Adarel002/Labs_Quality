package edu.adamko;

/**
 * @author Rooxaan
 * @version 1.0.0
 * @project lab2
 * @class Triangle
 * @since 27.03.2025 - 14.28
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public boolean isEquilateral() {
        return sideA == sideB && sideB == sideC;
    }

    public boolean isIsosceles() {
        return sideA == sideB || sideB == sideC || sideA == sideC;
    }

    public boolean isScalene() {
        return !isEquilateral() && !isIsosceles();
    }

    public boolean isRightTriangle() {
        double[] sides = {sideA, sideB, sideC};
        java.util.Arrays.sort(sides);
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }

    public double getAngleA() {
        return Math.toDegrees(Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)));
    }

    public double getAngleB() {
        return Math.toDegrees(Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)));
    }

    public double getAngleC() {
        return 180 - getAngleA() - getAngleB();
    }

    public double getInradius() {
        return calculateArea() / (calculatePerimeter() / 2);
    }

    public double getCircumradius() {
        return (sideA * sideB * sideC) / (4 * calculateArea());
    }

    public double getMedianA() {
        return 0.5 * Math.sqrt(2 * Math.pow(sideB, 2) + 2 * Math.pow(sideC, 2) - Math.pow(sideA, 2));
    }

    public double getMedianB() {
        return 0.5 * Math.sqrt(2 * Math.pow(sideA, 2) + 2 * Math.pow(sideC, 2) - Math.pow(sideB, 2));
    }

    public double getMedianC() {
        return 0.5 * Math.sqrt(2 * Math.pow(sideA, 2) + 2 * Math.pow(sideB, 2) - Math.pow(sideC, 2));
    }
}

