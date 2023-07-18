package 스노우.day1.팀장님지시사항.part1;

public class Circle extends Shape{
    private double radius;
    private int dimension = 2;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int getDimension() {
        return dimension;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calculateDiameter() {
        return 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }
}
