package 스노우.day1.팀장님지시사항.part1;

public class Rectangle extends Shape{
    private double width;
    private double height;
    private int dimesion = 2;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getDimension() {
        return dimesion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateDiagonal() {
        return Math.sqrt(width*width + height*height);
    }

    public double calculatePerimeter() {
        return width*2 + height*2;
    }
}
