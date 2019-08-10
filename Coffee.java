import java.util.*;

public class Coffee{
  
public static void main(String []ar)
{
  Scanner s=new Scanner(System.in);
   int x,p,total=0;
   x=s.nextInt();
   p=s.nextInt();
   p=100-p;
   while(x>0)
   {
       total=total+x;
       x=(p*x)/100;
   }
   System.out.println(total);
}
}
