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
        int a;
        monthsCalculation(a);

        Scanner repeat = new Scanner(System.in);
        int yes ;
        int no;
        if(repeat==yes){}


    }


    public static void monthsCalculation(){
int m = 12;
int q;
String monthString;

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


return;
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
                dayString = "Invalid day";

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
