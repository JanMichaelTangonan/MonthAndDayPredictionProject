import java.util.Scanner;

public class MonthAndDayPredictionProject {


    public static void main(String[] args) {
        //Variables
        int m; //monthInput
        int q; //dayInput
        int yearInput;
        int thePoem;
        boolean loop = true;

        //Scanner
        Scanner userBirthDayInput = new Scanner(System.in);

        while(loop){
            //Introduction
            System.out.println("There is an old nursery rhyme that goes like this...\n" + "Monday's child is fair of face\n" +
                    "Tuesday's child is full of grace/n" + "Wednesday's child is full of woe\n" + "Thursday's child has far to go\n"
                    + "Friday's child is loving and giving\n + Saturday's child is loving and giving\n" + "But the child born on the Sabbath Day, Is fair and wise and good in every way\n"
                    + "\n" + "Let's find out which of the poems corresponds with your birthday!");

            //Question prompts
            System.out.println("What month were you born?");
            m = userBirthDayInput.nextInt();
            if (m<=12){
                System.out.print(m);
            }

            System.out.println("What day were you born?");
            q = userBirthDayInput.nextInt();

            System.out.println("What year were you born?");
            yearInput = userBirthDayInput.nextInt();




            poemDependingOnDay(thePoem);
            System.out.print("Poem");

        }



    }

    public static int calculations(int month, int day, int year, int yearOfTheCentury, int zeroBasedCentury, int h) {

        int q = dayOfTheMonth(day);
        int K = year % 100;
        int J = year / 100;
        h = (q + (13 * (month + 1) / 5) + K + (K / 4) + (J / 4) - 2 * J) % 7;


        return month;
    }


    public static int dayOfTheMonth(int daysInAMonth) {

        int year;

        //Day of the month
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
                if(year%4 || year/4){

                    System.out.println("Which is a leap year");
                }

                else{

                    System.out.println("Which is NOT a leap year");
                }

        }

    }

    public static int months(int month){

        //Month
        String NameOfMonth;
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

            default:
                System.out.print("Invalid date.");
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

    public static int poemDependingOnDay(int poem) {
        //Poems according to date of birth

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

        return poem;
    }
}
