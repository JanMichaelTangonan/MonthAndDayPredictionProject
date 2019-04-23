import java.util.Scanner;

public class MonthAndDayPredictionProject {


    public static void main(String[] args) {
        //Variables
        int monthInput;
        int dayInput;
        int yearInput;

        //Scanner with the question prompts
        Scanner userBirthDayInput = new Scanner(System.in);

        System.out.println("What month were you born?");
        monthInput = userBirthDayInput.nextInt();

        System.out.println("What day were you born?");
        dayInput = userBirthDayInput.nextInt();

        System.out.println("What year were you born?");
        yearInput = userBirthDayInput.nextInt();


        //Placeholder stuff
        //dayOfTheMonth();
        dayOfTheWeek();
        //poemDependingOnDay();

        Scanner repeat = new Scanner(System.in);
        int yes;
        int no;
        boolean loop = true;

    }


    public static void dayOfTheMonth(Scanner monthAndDay) {
        int month;
        int numberOfDayInMonth;
        int year;
        int yearOfTheCentury;

        month = 13;
        numberOfDayInMonth = 32;

        //Switch statements
        switch (month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;
        }

        switch (numberOfDayInMonth) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                break;
            case 29:
            case 30:
            case 31:
                break;
        }


        /*switch (){
        if(monthAndDay<=28) {
            case 1:
                System.out.println("January");


        }
        }*/


    }


    public static void dayOfTheWeek() {
        //The days of the week
        int dayOftTheWeek;
        dayOftTheWeek = 7;
        String dayString;

        switch (dayOftTheWeek) {
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
                System.out.println("There is probably a bug here...\nBETTER FIX IT!");
                break;

        }
    return;
    }

/*    public static String poemDependingOnDay() {
        //Poems according to date of birth

        if ( dayOfTheMonth();){
            System.out.println("Monday's child is fair of face.");
        }

        else if ( dayOfTheMonth();
        dayOfTheWeek()){
            System.out.println("Tuesday's child is full of grace.");

        }

        else if ( dayOfTheMonth();
        dayOfTheWeek()){
            System.out.println("Wednesday's child is full of woe.");

        }

        else if ( dayOfTheMonth();
        dayOfTheWeek()){
            System.out.println("Thursday's child has far to go.");
        }

        else if ( dayOfTheMonth();
        dayOfTheWeek()){
            System.out.println("Friday's child loving and giving.");
        }

        else if ( dayOfTheMonth();
        dayOfTheWeek()){
            System.out.println("Saturday's child works hard for a living");
        }

        else if ( dayOfTheMonth();
        dayOfTheWeek()){
            System.out.println("But the child born on Sabbath day, is fair and wise and good in every way.");
        }


    }*/

}
