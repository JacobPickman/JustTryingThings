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
public class ClassifiedStaff extends Employee{
    //Instance Variables
    private double weeklySalary;
    private String division;
    
    //Jacob: Methods
    public ClassifiedStaff (String name, int number, boolean working, double salary, String div) {
        super(name, number, working);
        this.weeklySalary = salary;
        this.division = div;
    }
    
    public double getPay() {
        return this.weeklySalary * 2;
    }
    
    public String toString() {
        return super.toString() + "\t" + this.weeklySalary + "\t" + this.division;
    }
}
