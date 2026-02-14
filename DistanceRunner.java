class Distance{
    int feet;
    double inches;

    public Distance(){
        feet=5;
        inches=2;
    }

    public Distance(int f,double i){
        feet=f;
        inches=i;
    }

    public void display(){
        System.out.println("Feet:"+feet);
        System.out.println("Inches:"+inches);
    }
}

public class DistanceRunner{
    public static void main(String[]args){
        Distance d1=new Distance();
        d1.display();
    }
}