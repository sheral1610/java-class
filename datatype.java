class datatype
{
public static void main(String args[])
{
int a=10;
float b= 20.5f;
char c= 'a';
long d=20;
double e=30.6;
short g=4;
boolean h=true;
byte i=1;
System.out.println("value of variable is "+a+" size of int "+Integer.BYTES);
System.out.println("value of variable is "+b+" size of float "+Float.BYTES);
System.out.println("value of variable is "+c+" size of char "+Character.BYTES);
System.out.println("value of variable is "+d+" size of long "+Long.BYTES);
System.out.println("value of variable is "+e+" size of double "+Double.BYTES);
System.out.println("value of variable is "+g+" size of short "+Short.BYTES);
System.out.println("value of variable is "+h);
System.out.println("value of variable is "+i+" size of byte "+Byte.BYTES);
}
}