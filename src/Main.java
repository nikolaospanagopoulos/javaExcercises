import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car myCarnew = new Car("toyota",56);

        Car myCarnew2 = new Car("bmw",70);

        Truck mynewTruck = new Truck("mercedes",89,"steel");

        Truck mynewTruck2 = new Truck("audi",75,"clay");

        List<Car> allCars = new ArrayList<>();
        allCars.add(myCarnew);
        allCars.add(myCarnew2);

        Car[]myCars = {
                myCarnew,
                myCarnew2,
                mynewTruck,
                mynewTruck2
        };
        myCars[0].setBrand("ford");
        System.out.println(myCarnew.getBrand());
        for(int i=0;i<myCars.length;i++){
            myCars[i].start();
            myCars[i].stop();
            myCars[i].accelerate();
        }


        for(int i=0;i<allCars.size();i++){
            allCars.get(i).start();
            allCars.get(i).stop();
            allCars.get(i).accelerate();
        }


        List<Truck>allTrucks = new ArrayList<>();
        allTrucks.add(mynewTruck);
        allTrucks.add(mynewTruck2);

        for(int i=0;i<allTrucks.size();i++){
            allTrucks.get(i).start();
            allTrucks.get(i).accelerate();
            allTrucks.get(i).stop();

        }

//        start(myCarnew);
//        stop(mynewTruck2);
//        acelerate(myCarnew2);


        char grade = 'X';

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very good");
                break;
            case 'C':
            case 'D':
                System.out.println("FAILED");
                break;
            default:
                System.out.println("not a valid input");
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int x = input.nextInt();

        switch (x){
            case 1 ->  System.out.println("you chose 1");
            case 2 ->  System.out.println("you chose 2");
            case 3 ->  System.out.println("you chose 3");
            case 4,5 ->  System.out.println("you chose 4 or 5");
            default -> System.out.println("you chose something else");
        }

        Autopolicy autopolicy = new Autopolicy(2,"nissan","MA");

        System.out.println("is no fault state: "+autopolicy.isNoFaultState());


        int n = 0;

        if(false && (x++>0)){
            System.out.println("this will never be printed");
        }
        if(true || (x++>0)){
            System.out.println("this will  be printed");
        }

        if(true ^ false){
            System.out.println("CRAZY!!!!");
        }

        int[] b = new int[10];
        for(int i = 0;i<b.length;i++){
            b[i] = i;
        }

        //create a normal array with random numbers, add them and calculate sum
        //create a normal array with ten numbers and make each number equeal its index
        //create a normal array with ten numbers and make each number equeal its index multiplied by 2 (*=)
        //create a normal array with random numbers, and using a switch statement print if the number is odd or even
        //num % 2==0 -> event / odd

        calculateArraySum(b);



    }
    public static int calculateArraySum(int [] myArr){
        return 0;
    }
}