
import java.util.Scanner;
public class Input implements Temp{

    double RRate,WUnit,EUnit,sum,discount,total;
    String name,number;
    
    @Override
    public void ElectricalRate() {
        //input Electrical Unit
        while(true){
       try{
            Scanner in = new Scanner(System.in);
            System.out.print("Electric Unit : ");
            EUnit = in.nextDouble();
        break;
       }
        
       catch(Exception e){
            System.out.print("Wrong Input!.\nPlease input again.\n");   
       }
       }
    }

    @Override
    public void WaterRate() {
        //Input Water Unit
        while(true){
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Water Unit : ");
            WUnit = in.nextDouble();
            break;
        }
        catch(Exception e){
            System.out.print("Wrong Input!.\nPlease input again.\n");
        }
        }
    }

    @Override
    public void RoomRate() {
        //input roomrate
        while(true){
        try{ 
            Scanner in = new Scanner(System.in);
            System.out.print("Room rate : ");
            RRate = in.nextDouble();
            break;
        }
        catch(Exception e){
            System.out.print("Wrong Input!.\nPlease input again.\n");
        }
        }
    }

    @Override
    public void Bill() {
        double e = EUnit*7;
        double w = WUnit*14;
        //output Bill
      System.out.println("\n-----PayBill-----"); 
      System.out.println("Your name : "+name); 
      System.out.println("Number room : "+number);
      System.out.println("Room rate : "+RRate);
      System.out.print("Electrical rate : ");
      System.out.format("%.2f", e);
      System.out.print("\nWater rate : ");
      System.out.format("%.2f", w);
      System.out.print("\n");
    }
    
    @Override
    public void Name() {
        //Input Name
        while(true){
        try{
            System.out.print("-----Invoice-----");
            Scanner in = new Scanner(System.in);
            System.out.print("\nYour name : ");
            name = in.nextLine();
        break;        
        }
        catch(Exception e){
            System.out.print("Wrong Input!.\nPlease input again.\n");
        }
        }
    }
     @Override
    public void NumberRoom() {
        //Input Room rate
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Number room : ");
            number = in.nextLine();
        }
        catch(Exception e){
            System.out.print("Wrong Input!.\nPlease input again.\n");
        }
    }

    @Override
    public void Total() {
        //Calculate
        sum = RRate+EUnit*7+WUnit*14;
        System.out.print("\nTotal : ");
        System.out.format("%.2f", sum);
        total = sum;
        
    }

    @Override
    public void discount() {
        
       if(EUnit > 1000 || EUnit == 1000){
          discount = sum*10/100;
          System.out.print("\nDiscount : "+discount);
          System.out.print("\nPayment : "+(total-discount));
          
    }
       if(EUnit > 1200 || EUnit == 1200)
       {
          discount = sum*15/100;
          System.out.print("\nDiscount : "+discount);
          System.out.print("\nPayment : "+(total-discount));
       }
       if(EUnit > 1500 || EUnit == 1500)
       {
          discount = sum*17/100;
          System.out.print("\nDiscount : "+discount);
          System.out.print("\nPayment : "+(total-discount));
       }
  
    }
}