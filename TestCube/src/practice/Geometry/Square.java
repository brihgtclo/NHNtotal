package practice.Geometry;

public class Square implements Nemo{
    private final double width;
    private final double height;
    public Square(double width, double height) {
        isSquare(width,height);
        this.width = width;
        this.height = height;
    }
    public Square(double length){
        this.height = length;
        this.width = length;
    }
    private void isSquare(double width2, double height2) {
        if(width2 != height2) throw new IllegalArgumentException("정사각형은 변의 길이가 같아야 합니다");
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Square [width=" + width + ", height=" + height + "]";
    }
}
