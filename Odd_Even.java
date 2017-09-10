import java.util.Scanner;
class Odd_Even              
{
public static void main(String args[])
{
int a;
Scanner S = new Scanner(System.in);
a=S.nextInt();
if(a<0)
{
System.out.println("negative");
}else if(a>0)
{
System.out.println("positive");
}else
System.out.println("zero");
}
}
