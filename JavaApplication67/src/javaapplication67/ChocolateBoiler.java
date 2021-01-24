package javaapplication67;

public class ChocolateBoiler {
private boolean empty;
private boolean boiled;

private static ChocolateBoiler uniqueInstance = null;
private static int boiler_status;

 private ChocolateBoiler()
{
empty = true;
		boiled = false;   
}
public static ChocolateBoiler getInstance()
{
if (uniqueInstance == null) {
    System.out.println( "Creating unique instance of Chocolate Boiler");

uniqueInstance = new ChocolateBoiler();
boiler_status = 0;
}
check_status();
System.out.println("Returning instance of Chocolate Boiler");
return uniqueInstance;
}

public void fill() {
   if(boiler_status == -1 || boiler_status == 0) {
       boiler_status = 1;
   }
   else{
       System.out.println("It is already full!!");
   }
}
 
public void drain() {
   if(boiler_status == 2) {
       boiler_status = -1;
   }
   else if(boiler_status == 1) {
       System.out.println("It is not boiled!!");
   }
}

public void boil() {
   if(boiler_status == 1) {
       boiler_status = 2;
   }
   else if(boiler_status == 2) {
       System.out.println("It is already boiled!!");
   }
   else {
       System.out.println("It is already empty!!");
   }
}
  
private static void check_status() {
   if(boiler_status == -1) {
       System.out.println("It is already empty!!");
   }
}


}

