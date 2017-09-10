import java.util.Scanner;
class Odd_Eve
{
    public static void main(String arg[])
    {
        int a;
        Scanner S = new Scanner(System.in);
        a=S.nextInt();
        if(a%2==0)
        {
            System.out.println("even");
        }else
        {
        System.out.println("odd");
        }
    }
}
