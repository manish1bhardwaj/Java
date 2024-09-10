import java.util.Scanner;
public class Palindrome {

    public boolean isPalinedrome(int x)
    {
        StringBuffer sb=new StringBuffer(""+x);
        String s1 = sb.reverse().toString();
        if(x==Integer.parseInt(s1)){
            return true;
        }
        else{
            return false;
         }
    }
    public static void main(String[] args) {
        int list[] = new int[5];
        Scanner sc = new Scanner(System.in);{
            Palindrome t1 = new Palindrome();
            System.out.println("Enter 5 element in array :");
            for (int x=0;x<list.length;x++)
            {
                list[x] = sc.nextInt();

            }
            System.out.println("Array elements :");
            for (int v:list)
            {
                if (t1.isPalinedrome(v))
                System.out.println(v+" ");
            }
            sc.close();
        }
    }
}
