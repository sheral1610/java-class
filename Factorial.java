class Factorial
{
public void factorial(int number)
{
int total=1;
for (int i = number; i>0; i--)
{
total=total*i;
}
System.out.print("total is"+total);
}
public static void main(String args[])
{
Factorial fact = new Factorial();
fact.factorial(5);
}}
