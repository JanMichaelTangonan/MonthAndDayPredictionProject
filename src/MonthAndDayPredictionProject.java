import java.util.Scanner;

public class MonthAndDayPredictionProject {

    public static void main(String[] args){




    }


    public static void writtenFormOfBirthMonth(){
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

    }


    public static int dayOfTheWeek(){
        //The days of the week

        int h;
        String sunday,monday,tuesday,wednesday,thursday,friday,saturday;
        h = 0,1,2,3,4,5,6;

        0 = sunday;
        1 = monday;
        2 = tuesday;
        3 = wednesday;
        4 = thursday;
        5 = friday;
        6 = saturday;

    }

    public static int poemDependingOnDay(){
        //Poems according to date of birth

        if(writtenFormOfBirthMonth();){
            System.out.println("Monday's child is fair of face.");}

        else if (writtenFormOfBirthMonth();){
            System.out.println("Tuesday's child is full of grace.");

        }

        else if (writtenFormOfBirthMonth();){
            System.out.println("Wednesday's child is full of woe.");

        }

        else if (writtenFormOfBirthMonth();){
            System.out.println("Thursday's child has far to go.");
        }

        else if(writtenFormOfBirthMonth();){
            System.out.println("Friday's child loving and giving.");
        }

        else if(writtenFormOfBirthMonth();){
            System.out.println("Saturday's child works hard for a living");
        }

        else if(writtenFormOfBirthMonth();){
            System.out.println("But the child born on Sabbath day, is fair and wise and good in every way.");
        }
    }


}
