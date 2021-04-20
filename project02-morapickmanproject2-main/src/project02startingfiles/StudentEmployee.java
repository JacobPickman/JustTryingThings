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
public class StudentEmployee extends Employee {
    //Instance Variables
    private int hoursWorked;
    private boolean isWorkStudy;
    private double payRate;
    
    //Antonio: Methods
    public StudentEmployee (String name, int number, boolean working, int hours, boolean workstudy, double rate) {
        super(name, number, working);
        this.hoursWorked = hours;
        this.isWorkStudy = workstudy;
        this.payRate = rate;
    }
    
    public double getPay() {
        return hoursWorked * payRate;
    }
    
    public String toString() {
        return super.toString() + "\t" + this.hoursWorked + "\t" + this.isWorkStudy + "\t" + this.payRate;
    }
}
