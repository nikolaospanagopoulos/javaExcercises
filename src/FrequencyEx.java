import java.security.SecureRandom;

public class FrequencyEx {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public enum status  {SUCESS,FAILED,STANDING_BY}
    public static status missileLaunch(){
        int userInput = 1;
        switch (userInput){
            case 1:
                return status.SUCESS;
            case 2:
                return status.FAILED;
            case 3:
                return status.STANDING_BY;
        }
        return status.FAILED;
    }

    public static void main(String[]args){
        Day today = Day.WEDNESDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
//        diceFrequencyArr();
//        diceFrequency();
        System.out.println(status.SUCESS);
    }

    public static void diceFrequencyArr(){
        SecureRandom randomNumbers = new SecureRandom();
        int []frequencies = new int [7];

        for(int roll = 1;roll<=6000000;roll++){
            frequencies[1+ randomNumbers.nextInt(6)]++;
        }
        for(int i = 1;i<frequencies.length;i++){
            System.out.println("Frequency "+i+" "+frequencies[i]);
        }

    }

    public static void diceFrequency(){
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;


        for(int i = 1;i<=6000000;i++){
            int face = 1 + randomNumbers.nextInt(6);
            switch (face){
                case 1:
                    frequency1++;
                    break;
                case 2:
                    frequency2++;
                    break;
                case 3:
                    frequency3++;
                    break;
                case 4:
                    frequency4++;
                    break;
                case 5:
                    frequency5++;
                    break;
                case 6:
                    frequency6++;
                    break;
            }
        }

        System.out.println("Frequency1 "+frequency1);
        System.out.println("Frequency2 "+frequency2);
        System.out.println("Frequency3 "+frequency3);
        System.out.println("Frequency4 "+frequency4);
        System.out.println("Frequency5 "+frequency5);
        System.out.println("Frequency6 "+frequency6);
    }
}
