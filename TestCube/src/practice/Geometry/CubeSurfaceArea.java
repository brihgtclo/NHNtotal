package practice.Geometry;


public class CubeSurfaceArea {
    public static double calculateBox(Box box){
        double result = 0;
        for(Square square : box.boxList){
            result += calculateNemo(square);
        }
        return result;
    }
    public static double calculateNemo(Nemo nemo){
        return nemo.getWidth()*nemo.getHeight();
    }
    public static double CalculateSquare(Square square){
        return calculateNemo(square);
    }
    public static double CalculateRectangle(Rectangle rectangle){
        return calculateNemo(rectangle);
    }
}
