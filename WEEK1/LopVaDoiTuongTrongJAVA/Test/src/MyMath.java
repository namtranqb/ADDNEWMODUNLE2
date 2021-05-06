public class MyMath {
    private double number1;
    private double number2;
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public double plus(){
        return number1+number2;
    }
    public double minus(){
        return number1-number2;

    }
    public  double multiply(double a,double b){
        return a*b;
    }
    public double share(double a,double b){
        return a/b;
    }

    public static void main(String[] args) {
        MyMath start = new MyMath();
        start.setNumber1(5);
        start.setNumber2(10);
        System.out.println(start.plus());
        System.out.println(start.minus());
        System.out.println(start.minus());
    }
}
