public class Expression{
    public static void main(String[] args) {
        char a = 'a';          //Because it can take byte , short, and char as an int in a expression.
        char b = 'b';
        // short b = 50;
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a+b); 
        System.out.println(b-a);

    }
}