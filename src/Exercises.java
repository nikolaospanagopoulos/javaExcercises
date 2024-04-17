import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercises {
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

        int[]randomnum = {5,89,14,57,89,42,56,7,8};

        int result = calculateArraySum(randomnum);

        System.out.println("EX 1: The sum of random numbers is " + result);

        //create a normal array with ten numbers and make each number equeal its index

        System.out.print("EX 2:");


        int[] tennumbers = new int[10];

        equalindex(tennumbers);


        for (int i=0; i<tennumbers.length; i++){
            System.out.println(tennumbers[i]);
        }

        //create a normal array with ten numbers and make each number equeal its index multiplied by 2 (*=)

        System.out.print("EX 3:");

        int[] arraynum = new int[10];

        multiply(arraynum);

        for (int i = 0; i<arraynum.length; i++){
            System.out.println(arraynum[i]);
        }

        //create a normal array with random numbers, and using a switch statement print if the number is odd or even

        int[] randomnumbers = {1,8,4,6,9,2,34,56,12,55};

        //num % 2==0 -> event / odd

        oddsandevens(randomnumbers);


    }
    public static int calculateArraySum(int [] myArr){
        int sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            sum += myArr[i];
        }
        return sum;
    }
    public static boolean equalindexSuccess(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return true;
    }
    public static int[] equalindex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

        }
        return arr;
    }

    public static int[] multiply(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    public static int oddsandevens(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = (arr[i] %  2);
            switch (result) {
                case 0:
                    System.out.println("Number  " + arr[i] +" is even");
                     break;

                default:
                    System.out.println("NUmber " + arr[i] + " is odd");
                    break;

            }
        }
        return result;
    }
    public static int makeDecision(){
        if(2 % 2 == 0){
            return 1;
        }

        return 0;
    }
}
