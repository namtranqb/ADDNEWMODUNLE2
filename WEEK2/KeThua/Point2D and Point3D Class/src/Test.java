import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(Arrays.toString(point2D.getXY()));

        point2D = new Point2D(3.4f,4.5f);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D();
        System.out.println(Arrays.toString(point3D.getXYZ()));


        point3D = new Point3D(point2D.getX(), point2D.getY(), 2.4f);
        System.out.println(Arrays.toString(point3D.getXYZ()));

        point3D = new Point3D(3.5f, 4.6f, 2.4f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
