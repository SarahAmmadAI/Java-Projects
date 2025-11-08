public class Strings{
    public static void main(String[]args){
        String name="Sarah";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('a','e'));
        System.out.println(name.replace("rah","ck"));
        System.out.println(name.startsWith("Sar"));
        System.out.println(name.startsWith("Par"));
        System.out.println(name.endsWith("rah"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("a",3));
        System.out.println(name.indexOf("r"));
        System.out.println(name.lastIndexOf('a',3));
        System.out.println(name.equals("Sarah"));
        System.out.println(name.equals("sarah"));
        System.out.println(name.equalsIgnoreCase("SArah"));
        System.out.println(name.equalsIgnoreCase("Sarah1"));
        System.out.println("I am escape sequence\"double quote");
        System.out.println("I am escape sequence\n double quote");
        System.out.println("I am escape sequence\t double quote");
    }
}