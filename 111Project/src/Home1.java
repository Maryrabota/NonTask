public class Home1 {
    public static void main(String[] args){
        String s = "S N PRASAD RAO";
        int spaces = s.length() - s.replace(" ", "").length();
        System.out.println(spaces);
        System.out.println(s);
        System.out.println(s.replace(" ", ""));
    }
}
