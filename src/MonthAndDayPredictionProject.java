import java.util.Scanner;

public class MonthAndDayPredictionProject {


    public static void main(String[] args) {
        //Variables
        int m;//monthInput
        int q;//dayInput
        int yearInput;//Year input
        int daysInAMonth;//Tells how many days are in the month that was given
        int theWeek = dayOfTheWeek(1);//The day of the week that the user was born in.
        int thePoem = poemDependingOnDay();//The poem depending on the users birthday.
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
            do{System.out.println("What month were you born?");
            m = userBirthDayInput.nextInt();
              }while (m<=1 || m>=31);

            do{System.out.println("What day were you born?");
            q = userBirthDayInput.nextInt();
              }while (q<=1 || q>=31);

            System.out.println("What year were you born? (Please type 4 digits)");
            yearInput = userBirthDayInput.nextInt();
              
            //Results
            System.out.println("According to your input you were born in " + m + q + yearInput);

            System.out.println("There are " + dayOfTheMonth( m,yearInput));

            System.out.println("According to your input you were born on a " + theWeek);

            System.out.println("Your birthday states that" + thePoem);
                
            System.out.println("You have reached the end of the program. Please type another birth date :D!");

        }



    }

    public static int calculations(int month, int q, int year, int h) {
        
        if (month ==1 || month==2){
        month = month +12;
        year = year-1;    
        }
        int K = year % 100;
        int J = year / 100;
        h = (q + (13 * (month + 1) / 5) + K + (K / 4) + (J / 4) - 2 * J) % 7;


        return h;
    }


    public static int dayOfTheMonth(int month, int year) {


        int leapYear = year/400;//*Check if correct, unsure if right please check*

        //Day of the month
        switch (month) {
            case 9:
            case 4:
            case 6:
            case 11:
               return 30;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 2:
                if(leapYear == 0){

                    return 29;
                }

                else{

                    return  28;
                }
            default:
                return -1;

        }

    }

    public static int monthOfBirth(int month){

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
                
                return month;
        }



    }


    public static int dayOfTheWeek(int NameOfWeek) {
        //The days of the week

        switch (NameOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("There is probably a bug here...\nBETTER FIX IT!");
                break;

        }

    return NameOfWeek;
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
