public class StaticIntro {
    public static void main(String[] args) {
        // Java variables have static type
        int x = 5;
        x = x + 1;
        System.out.println(x);
        int y = x;
        x = x + 1;
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
    }
}