class ShapesArea
{
public void area(int a){
System.out.println("area of square"+(a*a));
}
public void area(int a,int b){
System.out.println("area of rectangle"+(a*b));
}
public void area(float p,int q)
{
System.out.println("area of rhombus"+((p*q)/2));
}
public static void main(String args[])
{
ShapesArea shapesArea=new ShapesArea();
shapesArea.area(1);
shapesArea.area(1,2);
shapesArea.area(3f,4);
}
}