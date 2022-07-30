public class ConstructorJava{
String fruitName;
String fruitColor;
String fruitSeason;

public ConstructorJava(){
System.out.println("Default Constructor called");
}
public ConstructorJava(String fName, String fruitColor, String fruitSeason){
fruitName=fname;
this.fruitColor=fruitColor;
this.fruitSeason=fruitSeason;
}
public ConstructorJava(ConstructorJava variable){
        fruitName = variable.fruitName;
        fruitColor = variable.fruitColor;
        fruitSeason=variable.fruitSeason;
}
public static void main(String args[]){
ConstructorJava Apple=new ConstructorJava();
System.out.println("Apple "+Apple.fruitName);
System.out.println("Apple "+Apple.fruitColor);
System.out.println("Apple "+Apple.fruitSeason);
Apple.fruitname="Apple";
Apple.fruitcolor="Red";
Apple.fruitSeason="All";

ConstructorJava Fruit2=new ConstructorJava("Mango", "Yellow" , "Summer");
System.out.println("Fruit2 "+Fruit2.fruitName);
System.out.println("Fruit2"+Fruit2.fruitColor);
System.out.println("Fruit2 "+Fruit2.fruitSeason);

ConstructorJava Fruit3=new ConstructorJava(Apple);
System.out.println("Fruit3 "+Fruit3.fruitName);
System.out.println("Fruit3"+Fruit3.fruitColor);
System.out.println("Fruit3"+Fruit3.fruitSeason);
}
}