public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        super();
    }
    public Cylinder(double height,double radius,String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.pow(getRadius(),2)*height*Math.PI;
    }
    @Override
    public String toString(){
        return "A Cylinder "
                +getColor()
                + ", radius: "
                +getRadius()
                +", Volume: "
                +getVolume()
                +"\n"+super.toString();
    }
}
