public class Arrays1{
    public static void main(String[]args){
        int[]marks={1,2,3,4,5};
        // System.out.println(mark[1]);
        // float[]marks={1f,2f,3f,4f,5f};
        // System.out.println(marks.length);
        // System.out.println(marks[1]);
        // String[]students={"Sarah","Ayesha","Moez","Hassaan"};
        // System.out.println(students.length);
        // System.out.println(students[0]);
        // Displaying the Array(Naive Way)
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=50;
        // Displaying the Array(for Loop)
        System.out.println("Printing using the for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for each loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
