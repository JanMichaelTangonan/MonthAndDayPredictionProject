import java.util.Scanner;

public class MonthAndDayPredictionProject {


    public static void main(String[] args){
        //Variables
        int monthInput;
        int dayInput;
        int yearInput;

        //Scanner with the question prompts
        Scanner userBirthDayInput = new Scanner (System.in);

        System.out.println("What month were you born?");
        monthInput  = userBirthDayInput.nextInt();

        System.out.println("What day were you born?");
        dayInput = userBirthDayInput.nextInt();

        System.out.println("What year were you born?");
        yearInput = userBirthDayInput.nextInt();



        //Placeholder stuff
        monthsCalculation();

        Scanner repeat = new Scanner(System.in);
        int yes ;
        int no;
        boolean loop = true;


    }


    public static void monthsCalculation(){
        int m = 13;
        int q = 32;
        String monthString = "Month";

//Switch statements
        switch (m){
            case 1:
                monthString = "January";
                break;

            case 2:
                monthString = "February";
                break;

            case 3:
                monthString = "March";
                break;

            case 4:
                monthString = "April";
                break;

            case 5:
                monthString = "May";
                break;

            case 6:
                monthString = "June";
                break;

            case 7:
                monthString = "July";

            case 8:
                monthString = "August";
                break;

            case 9 :
                monthString = "September";
                break;

            case 10:
                monthString = "October";
                break;

            case 11:
                monthString = "November";
                break;

            case 12:
                monthString = "December";
                break;
        }

        switch (q){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            case 29:
                break;
            case 30:
                break;
            case 31:
                break;
        }



    }


    public static int dayOfTheWeek(){
        //The days of the week
        int h = 7;
        String dayString;

        switch (h) {
            case 0:
                dayString = "Saturday";
                break;

            case 1:
                dayString = "Monday";
                break;

            case 2:
                dayString = "Tuesday";

            case 3:
                dayString = "Wednesday";
                break;

            case 4:
                dayString = "Thursday";
                break;

            case 5:
                dayString = "Friday";
                break;

            case 6:
                dayString = "Saturday";
                break;

            default:
                System.out.print("The day that you have typed does not exist/nPlease try again!");

        }

        return;
    }

    public static int poemDependingOnDay(){
        //Poems according to date of birth

        if(monthsCalculation();){
            System.out.println("Monday's child is fair of face.");}

        else if (monthsCalculation();dayOfTheWeek()){
            System.out.println("Tuesday's child is full of grace.");

        }

        else if (monthsCalculation();dayOfTheWeek()){
            System.out.println("Wednesday's child is full of woe.");

        }

        else if (monthsCalculation();dayOfTheWeek()){
            System.out.println("Thursday's child has far to go.");
        }

        else if(monthsCalculation();dayOfTheWeek()){
            System.out.println("Friday's child loving and giving.");
        }

        else if(monthsCalculation();dayOfTheWeek()){
            System.out.println("Saturday's child works hard for a living");
        }

        else if(monthsCalculation();dayOfTheWeek()){
            System.out.println("But the child born on Sabbath day, is fair and wise and good in every way.");
        }


    }

}
