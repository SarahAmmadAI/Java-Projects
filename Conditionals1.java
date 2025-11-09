import java.util.Scanner;
public class Conditionals1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String var="Sarah";
        switch(var){
            case "Sarah":
            System.out.println("You are going to become an adult");
            break;
            case "Ayesha":
            System.out.println("You are going to join a job");
            break;
            case "Zara":
            System.out.println("You are going to get retired");
            break;
            default:
            System.out.println("Enjoy your life");
            input.close();
        }
    
    }
    
}
