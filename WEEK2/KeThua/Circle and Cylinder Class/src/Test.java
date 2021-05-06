public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("blue");
        circle.setRadius(4.0D);
        System.out.println(circle.toString());

        System.out.println();

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5.0D);
        cylinder.setRadius(4.5D);
        cylinder.setColor("red");
        System.out.println(cylinder.toString());
    }
}
