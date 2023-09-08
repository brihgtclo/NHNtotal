package practice;

public class Geometry {

    public static double cubeSurfaceArea(double length){
        return 6*(length*length);
    }

    public static double box(double hieght, double width, double depth){
        return 2 * (hieght*depth + hieght*width + width*depth);
    }

    public static double square(double length){
        return length*length;
    }
    public static double square(double hieght, double width){
        if(hieght != width) throw new IllegalArgumentException("정사각형은 가로 세로가 같아야 합니다");
        return hieght*width;
    }
    public static double rectangle(double a, double b){
        return a*b;
    }

}
