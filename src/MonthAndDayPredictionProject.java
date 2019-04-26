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
        
                boolean loop = true;

        int h = dayOfTheWeek();
        int q = dayOfTheMonth();
        int m;
        int K = yearInput%100;
        int J = yearInput/100;

        h=(q+(13*(m+1)/5)+K+(K/4)+(J/4)-2*J)%7;

    }
    
    
    public static int dayOfTheMonth(int month) {
        
        int daysInAMonth;
        int year;
        int yearOfTheCentury;

        //Switch statements
        String NameOfMonth
        switch (month) {
            case 1:
                NameOfMonth = ("January");
                break;

            case 2:
                NameOfMonth = ("February");
                break;

            case 3:
                NameOfMonth = ("March");
                break;

            case 4:
                NameOfMonth = ("April");
                break;

            case 5:
                NameOfMonth = ("May");
                break;

            case 6:
                NameOfMonth = ("June");
                break;

            case 7:
                NameOfMonth = ("July");

            case 8:
                NameOfMonth = ("August");
                break;

            case 9:
                NameOfMonth = ("September");
                break;

            case 10:
                NameOfMonth = ("October");
                break;

            case 11:
                NameOfMonth = ("November");
                break;

            case 12:
                NameOfMonth = ("December");
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
                int leapYear = 4%100;
                if ((year % 4 == 0) && (year % 100 != 0) && (year%400!=0)){
                    System.out.print(year + "is a leap year");

                }
                else {
                    System.out.println(year + "is NOT a leap year");

                }
                break;

        }

    }


    public static int dayOfTheWeek(int NameOfWeek) {
        //The days of the week
        String dayString;

        switch (NameOfWeek) {
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
