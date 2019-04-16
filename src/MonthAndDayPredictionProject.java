import java.util.Scanner;

public class MonthAndDayPredictionProject {

    public static void main(String[] args){
        //Placeholder stuff
        int a;
        writtenFormOfBirthMonth(a);



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
return;
    }


    public static int dayOfTheWeek(){
        //The days of the week
        int h;
        int dayOfTheWeek = h;
        h saturday,sunday,monday,tuesday,wednesday,thursday,friday;

        0 = saturday;
        1 = sunday;
        2 = monday;
        3 = tuesday;
        4 = wednesday;
        5 = thursday;
        6 = friday;


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
