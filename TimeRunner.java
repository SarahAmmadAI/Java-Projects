class Time{
    public int hrs;
    public int min;
    public int sec;

    public Time(){
        hrs=0;
        min=0;
        sec=0;
    }

    public Time(int hrs,int min,int sec){
        if(hrs>=0 && hrs<24){
            this.hrs=hrs;
        }else{
            System.out.println("Invalid hours");
        }

        if(min>=0 && min<60){
            this.min=min;
        }else{
            System.out.println("Invalid minutes");
        }

        if(sec>=0 && sec<60){
            this.sec=sec;
        }else{
            System.out.println("Invalid seconds");
        }
    }
    public void display(){
        System.out.println("Hours:"+hrs);
        System.out.println("Minutes:"+min);
        System.out.println("Seconds:"+sec);
    }
}

public class TimeRunner{
    public static void main(String[] args) {
        Time t1=new Time(12,30,59);
        t1.display();
    }
}