import java.util.*;
class A
{
A()
{
System.out.println("Unknown");
}
A(String name)
{
System.out.println(name);
}
public static void main(String args[])
{
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value");
name=sc.next();
A obj1=new A();
A obj2=new A(name);
}
}


