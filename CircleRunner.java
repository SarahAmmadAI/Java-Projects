class Circle {
    double radius;
    String unit;

    public Circle(){
        radius=4;
        unit="cm";
    }

    public Circle(double r,String u){
        radius=r;
        unit=u;
    }

    public void calculateCircumference(){
        System.out.println("Circumference:"+2*Math.PI*radius+unit);
    }
}

public class CircleRunner{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.calculateCircumference();
    }
}
