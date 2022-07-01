public class FirstClass1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(massage(args));
    }
    public static String massage (String [] args){
        return args [1];
    }
}
