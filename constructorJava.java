public class constructorJava{
String fruitName;
String fruitColor;
String fruitSeason;

public constructorJava(){
System.out.println("Default Constructor called");
}
public constructorJava(String fruitName, String fruitColor, String fruitSeason){
this.fruitName= fruitName;
this.fruitColor=fruitColor;
this.fruitSeason= fruitSeason;
}
public constructorJava(constructorJava Variable){
this.fruitSeason = Variable.fruitSeason;
}


public static void main(String args[]){
constructorJava Apple=new constructorJava();

Apple.fruitName="Apple";
Apple.fruitColor="Red";
Apple.fruitSeason="All";
System.out.println("Apple "+Apple.fruitName);
System.out.println("Apple "+Apple.fruitColor);
System.out.println("Apple "+Apple.fruitSeason);


constructorJava Fruit2=new constructorJava("Mango", "Yellow" , "Summer");
System.out.println("Fruit2 "+Fruit2.fruitName);
System.out.println("Fruit2"+Fruit2.fruitColor);
System.out.println("Fruit2 "+Fruit2.fruitSeason);

constructorJava Fruit3=new constructorJava(Apple);
Fruit3.fruitName="Green Apple";
Fruit3.fruitColor="Green ";
//Fruit3.fruitSeason="All";
System.out.println("Fruit3"+Fruit3.fruitName);
System.out.println("Fruit3"+Fruit3.fruitColor);
System.out.println("Fruit3"+Fruit3.fruitSeason);

}
}