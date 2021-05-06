public class Test {
    public static void main(String[] args) {
        Point point = new Point(2.3f,3.4f);
        System.out.println(point.toString());


        MovablePoint movablePoint = new MovablePoint(point.getX(), point.getY(),1.11f,2.22f);
        System.out.println(movablePoint.toString());


        movablePoint.setXY(3.3f,4.4f);
        System.out.println(movablePoint.toString());

        movablePoint.setSpeed(2.0f,3.0f);
        System.out.println(movablePoint.move());
    }
}
