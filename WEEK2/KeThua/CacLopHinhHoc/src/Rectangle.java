public class Rectangle extends Shape{
    private double width =1.0D;
    private double height = 1.0D;

    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public  Rectangle(String color
            , boolean filled
            , double width
            , double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width + height)* 2;
    }

    @Override
    public String toString(){
        return "A Rectangle with width = "
                +getWidth()
                +" and height = "
                +getHeight()
                +", which is a subclass of "
                +"\n" +super.toString();
    }
}

