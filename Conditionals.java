import java.util.Scanner;
public class Conditionals {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        char var='r';
        switch(var){
            case 'r':
            System.out.println("You are going to become an adult");
            break;
            case 'a':
            System.out.println("You are going to join a job");
            break;
            case 'v':
            System.out.println("You are going to get retired");
            break;
            default:
            System.out.println("Enjoy your life");
            input.close();
        }
    
    }
    
}
