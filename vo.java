import java.util.*;
class vo
{
    public static void main(String arg[])
    {
     //char a;
     Scanner reader = new Scanner(System.in);
     char a1 = reader.nextChar();
     if(a1 == 'a' || a1 == 'e' || a1 == 'i' || a1 == 'o' || a1 == 'u')
         {
             System.out.print("vowel");
         }else
         {
             System.out.print("consonant");
         }
     
    }
}
