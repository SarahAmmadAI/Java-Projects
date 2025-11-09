public class Arrays {
    public static void main(String[]args){
        // There are 3 main ways to write arrays
        // Declaration and then memory allocation
        int[]marks;
        marks=new int[5];
        marks[0]=23;
        marks[1]=56;
        marks[2]=78;
        System.out.println(marks[2]);
        int[]chickens=new int[10];
        chickens[3]=20;
        System.out.println(chickens[3]);
        int[]cups={1,2,3,4,5};
        System.out.println(cups[0]);
    }  
}
