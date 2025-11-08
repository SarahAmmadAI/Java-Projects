public class GradeEncryption{
    public static void main(String[]args){
        char grade='B';
        //Encryption
        grade=(char)(grade+8);
        System.out.println(grade);
        //Decryption
        grade=(char)(grade-8);
        System.out.println(grade);
    }
}

