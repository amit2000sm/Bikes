import java.util.*;
class Year
{
static int first()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st Year");
int a=sc.nextInt();
System.out.println("Enter 2nd Year");
int b=sc.nextInt();
if(a%4==0 && a%100==0 && a%400==0 && b % 4==0 && b%100==0 &&b%100==0){
 return (a+b);
}
else{
return (a-b);
}
}
public static void main (String args[])
{
System.out.println(first());
}
}



