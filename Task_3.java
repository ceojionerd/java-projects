// package income;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Task_3 {

    public static void main(String[] args) {

        int sum = 0;
        int months = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Write the income of each month.");
        ArrayList<Integer> array = new ArrayList<>();

        while(true){
            months++;
            System.out.println("Write the income for month" + months + ":");
            int income = input.nextInt();
            if(income >= 0){
                sum += income;
        
                array.add(income);
        
            }
            else {
                break;
            }
        }

        /*This did not work
          for(int i= 0; i < array.size(); i++){
              if(income < 0){
                  array.remove(i);
              }
          }*/
        months--;

        System.out.println("The total income is " + sum);
        System.out.println("The average income is " + sum/months);

        //This one below works fine
        System.out.println("The biggest income is " + Collections.max(array));
        } 
    }