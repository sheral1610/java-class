public class sorting{
public static void main(String args[])
{
int[] array={1,60,6,89,10};
for(int i=0;i<array.length;i++)
{
for(int j=0;j<array.length;j++)
{
if(array[i]<array[j])
{
int temp=array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
for(int i=0;i<array.length;i++)
{
System.out.println(array[i]+ "  ");
}
}}



