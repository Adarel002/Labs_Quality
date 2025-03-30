package edu.adamko;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rooxaan
 * @version 1.0.0
 * @project lab2
 * @class TriangleTest
 * @since 27.03.2025 - 14.37
 */


import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void calculatePerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(12.0, triangle.calculatePerimeter(), 0.0001);
    }

    @Test
    public void calculateArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(6.0, triangle.calculateArea(), 0.0001);
    }

    @Test
    public void isEquilateral() {
        Triangle triangle = new Triangle(5, 5, 5);
        Assert.assertTrue(triangle.isEquilateral());
    }

    @Test
    public void isIsosceles() {
        Triangle triangle = new Triangle(5, 5, 3);
        Assert.assertTrue(triangle.isIsosceles());
    }

    @Test
    public void isScalene() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertTrue(triangle.isScalene());
    }

    @Test
    public void isRightTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertTrue(triangle.isRightTriangle());
    }

    @Test
    public void getAngleA() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(36.8699, triangle.getAngleA(), 0.0001);
    }

    @Test
    public void getAngleB() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(53.1301, triangle.getAngleB(), 0.0001);
    }

    @Test
    public void getAngleC() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(90.0, triangle.getAngleC(), 0.0001);
    }

    @Test
    public void getInradius() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(1.0, triangle.getInradius(), 0.0001);
    }

    @Test
    public void getCircumradius() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(2.5, triangle.getCircumradius(), 0.0001);
    }

    @Test
    public void getMedianA() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(4.272001872658765, triangle.getMedianA(), 0.0001);
    }

    @Test
    public void getMedianB() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(3.605551275463989, triangle.getMedianB(), 0.0001);
    }

    @Test
    public void getMedianC() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assert.assertEquals(2.5, triangle.getMedianC(), 0.0001);
    }
}