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

        int h = dayOfTheWeek();
        int q = dayOfTheMonth();
        int m;
        int K;
        int J;

        h=(q+13(m+1)/5+K+K/4+J/4-2J)%7;

        poemDependingOnDay();



        //Placeholder stuff
        dayOfTheMonth();

        //poemDependingOnDay();

        Scanner repeat = new Scanner(System.in);
        boolean loop = true;

    }


    public static int dayOfTheMonth(Scanner monthAndDay) {
        int month;
        int daysInAMonth;
        int year;
        int yearOfTheCentury;

        month = 13;
        daysInAMonth = 13;

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

        switch (daysInAMonth) {
            case 9:
            case 4:
            case 6:
            case 11:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31 days");
                break;
            case 2:
                int february = 28;
                if ((year % 4 == 0) && (year % 100 != 0) && (year%400!=0)){
                    System.out.print(year + "is a leap year");

                }
                else {
                    System.out.println(year + "is NOT a leap year");

                }
                break;

        }

    }


    public static int dayOfTheWeek() {
        //The days of the week
        int dayOftTheWeek;
        dayOftTheWeek = 7;
        String dayString;

        switch (dayOftTheWeek) {
            case 0:
                dayString = "Sunday";
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
    }

    public static String poemDependingOnDay(){
        //Poems according to date of birth
       /* if ( dayOfTheMonth();){
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


        int poem =7;
        switch (poem) {
            case 0:
                System.out.print("But the child born on Sabbath day, is fair and wise and good in every way");
                break;
            case 1:
                System.out.println("Monday's child is fair of face.");
                break;
            case 2:
                System.out.print("Tuesday's child is full of grace.");
                break;
            case 3:
                System.out.print("Wednesday's child is full of woe.");
                break;
            case 4:
                System.out.print("Thursday's child has far to go");
                break;
            case 5:
                System.out.print("Friday's child is loving and giving.");
                break;
            case 6:
                System.out.print("Saturday's child works hard for a living.");
                break;

        }

        return;
    }
}
