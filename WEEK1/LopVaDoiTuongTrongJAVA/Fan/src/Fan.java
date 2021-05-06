import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius =5D;
    private String color ="blue";

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(this.on) {
            return ("\nspeed: "+this.speed
                    + "\ncolor: " + this.color
                    + "\nradius: " + this.radius
                    + "\nfan is on");
        }else
            return ("\nspeed: "+this.speed
                    + "\ncolor: " + this.color
                    + "\nradius: " + this.radius
                    + "\nfan is off");
        }

    public static void main(String[] args) {
        Fan def = new Fan();
        System.out.println("Default: "+def.toString());
        Fan fan1 = new Fan();
            fan1.setSpeed(3);
            fan1.setRadius(10D);
            fan1.setColor("yellow");
            fan1.setOn(true);
        System.out.println("\n");
        System.out.println("Fan 1: "+fan1.toString());
        Fan fan2 = new Fan();
            fan2.setSpeed(2);
            fan2.setRadius(5D);
            fan2.setColor("blue");
            fan2.setOn(false);
        System.out.println("\n");
        System.out.println("Fan 2: "+fan2.toString());

    }
}
