import java.security.SecureRandom;

public class Arrays {

     public static void main(String[]args){
         Car myCar = new Car("nissan",200);
         Car myCar2 = new Car("ford",200);
         Car myCar3 = new Car("bmw",200);


         Car[]myCars = {
                 myCar,
                 myCar2,
                 myCar3
         };

         myCars[1].setBrand("jaguar");
         System.out.println(myCars[1]);
         System.out.println(myCar2);

         int myNum = 2;
         int []arr = {
                 myNum,2,3,4
         };
         arr[0] = 10;
         System.out.println(myNum);

         Car[]carHeapArr = new Car[10];


         final int arrayLength = 10;


         Car[]myCars2 = new Car[arrayLength];









     }


}
