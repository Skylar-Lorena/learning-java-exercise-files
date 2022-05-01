package org.classroom;

public class CostOfMeal {
    //    Implement a program that calculates the total cost of  a meal (meal price, tip rate, tax rate)
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate ){//      outputting data using parameters
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
//        returning a value allows us to take a variable value within a function and allow it to be accessed within different scopes of our program
    }

    public static void main(String[] args) {
       double  groupTotalMealPrice= calculateTotalMealPrice(15, 2, 6.00);
        System.out.println(groupTotalMealPrice);
        double individualMealPrice = groupTotalMealPrice/5;
        System.out.println(individualMealPrice);

    }
}
