class Marks {
    int marks1;
    int marks2;
    int marks3;

    public Marks(){
        marks1=49;
        marks2=45;
        marks3=47;
    }

    public Marks(int marks1,int marks2,int marks3){
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }

    public int calculateSum(){
        return(marks1+marks2+marks3);
    }
}

public class MarksRunner{
    public static void main(String[] args) {
        Marks m1=new Marks();
        System.out.println(m1.calculateSum());
    }
}
