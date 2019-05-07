package com.LickingHeights;
import java.util.Scanner;

public class MonthAndDayPredictionProject {


    public static void main(String[] args) {
        //Variables
        int m;//monthInput
        int q;//dayInput
        int yearInput;//Year input

        boolean loop = true;

        //Scanner
        Scanner userBirthDayInput = new Scanner(System.in);

        while(loop){
            //Introduction
            System.out.println("There is an old nursery rhyme that goes like this...\n" + "Monday's child is fair of face\n" +
                    "Tuesday's child is full of grace\n" + "Wednesday's child is full of woe\n" + "Thursday's child has far to go\n"
                    + "Friday's child is loving and giving\n" + "Saturday's child is loving and giving\n" + "But the child born on the Sabbath Day, Is fair and wise and good in every way\n"
                    + "\n" + "Let's find out which of the poems corresponds with your birthday!");

            System.out.println("");

            //Question prompts
            System.out.println("What month were you born?");
            m = userBirthDayInput.nextInt();

            System.out.println("What day were you born?");
            q = userBirthDayInput.nextInt();

            System.out.println("What year were you born? (Please type 4 digits)");
            yearInput = userBirthDayInput.nextInt();


            //Results

            //int h =calculations(m,q,yearInput);

            System.out.println("There are " + dayOfTheMonth( m,yearInput) + " days in " + monthOfBirth(m));

            System.out.println("According to your input you were born in " + monthOfBirth(m) + ","+ q+ ","  + yearInput );

            System.out.println("According to your input you were born on a " + dayOfTheWeek(calculations(m,q,yearInput)));

            System.out.println("According to your input "+poemDependingOnDay(calculations(m,q,yearInput)));

            System.out.println("You have reached the end of the program. Please type another birth date :D!");

            System.out.println("---------------END---------------");

            System.out.println("");



        }while (loop = true);



    }

    public static int calculations(int month, int q, int year) {

        if (month<=2){
            month = numberOfMonthForCalculations(month);
            year = year-1;
        }
        int K = year % 100;
        int J = year / 100;
        int h = (q + (13 * (month + 1) / 5) + K + (K / 4) + (J / 4) + 5* J) % 7;


        return h;
    }


    public static int dayOfTheMonth(int month, int year) {


        //boolean leapYear = false;//*Check if correct, unsure if right please check*

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
                if(year % 4 == 0 || year%100 == 0 || year%400 == 0){

                    return 29;

                }else
                    return 28;

            default:
                break;


        }

        return year;
    }




    public static String monthOfBirth(int month){

        //Month
        switch (month) {
            case 1:
                return ("January");


            case 2:
                return ("February");


            case 3:
                return ("March");


            case 4:
                return ("April");


            case 5:
                return ("May");

            case 6:
                return ("June");


            case 7:
                return ("July");

            case 8:
                return ("August");

            case 9:
                return ("September");

            case 10:
                return ("October");

            case 11:
                return ("November");

            case 12:
                return ("December");

            default:
                System.out.print("ERROR!\n" + "The month that you have entered does not exist.\n" + "Please restart and type again!");


        }

        return String.valueOf(month);

    }

    public static int numberOfMonthForCalculations(int numMonth){

        //Return the correct number of the months in order to execute a proper calculation
        switch(numMonth){
            case 1:
                return 13;

            case 2:
                return 14;

            case 3:
                return 3;

            case 4:
                return 4;

            case 5:
                return 5;

            case 6:
                return 6;

            case 7:
                return 7;

            case 8:
                return 8;

            case 9:
                return 9;

            case 10:
                return 10;

            case 11:
                return 11;

            case 12:
                return 12;

            default:
                return 0;


        }

    }


    public static String dayOfTheWeek(int nameOfWeek) {
        //The days of the week

        switch (nameOfWeek) {
            case 0:
                return ("Saturday");
                

            case 1:
                return ("Sunday");
                

            case 2:
                return ("Monday");
                
            case 3:
                return ("Tuesday");
                

            case 4:
                return ("Wednesday");
                

            case 5:
                return("Thursday");
                

            case 6:
                return ("Friday");
                
        }

        return String.valueOf(nameOfWeek);
    }

    public static String poemDependingOnDay(int poem) {
        //Poems according to date of birth

        switch (poem) {
            case 0:
                return ("You work hard for a living. ");
                
            case 1:
                return ("You are fair and wise and good in every way. ");
                
            case 2:
                return ("You are good looking. ");
                
            case 3:
                return ("You are full of grace. ");
                
            case 4:
                return ("You are full of woe. ");
                
            case 5:
                return ("You have far to go. ");
 
            case 6:
                return ("You are loving and giving. ");
               

        }

        return String.valueOf(poem);
    }
}

