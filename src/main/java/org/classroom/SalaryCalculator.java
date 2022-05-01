package org.classroom;

public class SalaryCalculator {
    //    Create a function that calculates an employee's yearly salary given number of hours per week and money made per hour.
//     Add an input that accounts for vacation days. Employee is unpaid on vacation days. 1 Vacation day = 8 hours of work
    public static int calculateTotalSalary(int hourlyRate, int hoursWorked, int vacationDays){
        int hours = hoursWorked;
        int vacationDeductions = vacationDays * hourlyRate;
        int rates = hourlyRate;
        int salary = hours * rates - vacationDeductions ;
        return salary;

    }

    public static void main(String[] args) {
        int  monthlySalary = calculateTotalSalary(25, 48, 0);
        System.out.println(monthlySalary);
        int yearlySalary = monthlySalary *12 ;
        System.out.println(yearlySalary);
    }


}
