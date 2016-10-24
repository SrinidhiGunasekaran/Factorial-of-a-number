import java.io.*;
class Factorial
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int number,fact,n;
number=Integer.parseInt(in.readLine());
n=number;
System.out.println("Factorial is:"+factorial(n));
}
catch(Exception e)
{
}
}
static int factorial(int n)
{
if(n==0)
{
return 1;
}
else
{
return (n*factorial(n-1));
}
}
}
