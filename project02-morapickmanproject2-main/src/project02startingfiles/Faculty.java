/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

/**
 *
 * @author s539742
 */
public class Faculty extends Employee{
    //Instance Variables
    private double annualSalary;
    private int weeksPerYear;
    private String department;
    
    //Antonio: Methods
    public Faculty (String name, int number, boolean working, double salary, int weeks, String dept) {
        super(name, number, working);
        this.annualSalary = salary;
        this.weeksPerYear = weeks;
        this.department = dept;
    }
    
    public double getPay() {
        return (this.annualSalary / this.weeksPerYear) * 2;
    }
    
    public String toString() {
        return super.toString() + "\t" + this.annualSalary + "\t" + this.weeksPerYear + "\t" + this.department;
    }
}
