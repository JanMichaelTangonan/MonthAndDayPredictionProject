package com.LickingHeights;
import java.util.Scanner;

public class MonthAndDayPredictionProject {


    public static void main(String[] args) {
        //Variables
        int m;//monthInput
        int q;//dayInput
        int yearInput ;//Year input
        int daysInAMonth;//Tells how many days are in the month that was given
        int nameOfMonth;//The name of the month
        int h;
        int nameOfWeek;//The day of the week that the user was born in.
        int thePoem ;//The poem depending on the users birthday.

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

            if(m==1){
                m = 13;
                yearInput--;
            }

            else if(m==2){
                m = 14;
                yearInput--;
            }

            System.out.println("There are " + dayOfTheMonth( m,yearInput) + "days in " + monthOfBirth(nameOfMonth));

            System.out.println("According to your input you were born in " + m + q + yearInput);

            h = calculations(m,q,yearInput);

            System.out.println("According to your input you were born on a " + dayOfTheWeek(nameOfWeek));

            System.out.println("Your birthday states that " + poemDependingOnDay(thePoem));
                
            System.out.println("You have reached the end of the program. Please type another birth date :D!");





        }while (loop = true);



    }

    public static int calculations(int month, int q, int year) {
        
        if (month ==1 || month==2){
        month = month +12;
        year = year-1;    
        }
        int K = year % 100;
        int J = year / 100;
        int h = (q + (13 * (month + 1) / 5) + K + (K / 4) + (J / 4) + 5 * J) % 7;


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

                    return 28;
                }

                else{

                    return  29;
                }
            default:
                return -1;

        }

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
                System.out.print("Invalid date.");


        }

        return String.valueOf(month);

    }

    /*public static int numberOfMonthForCalculations(int numMonth){
        
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
    
    }*/
    
    
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
