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
public abstract class Employee {
    //Instance Variables
    private String employeeName;
    private int employeeid;
    private boolean isWorking;
    
    //Jacob: Methods
    public Employee (String name, int number, boolean working) {
        this.employeeName = name;
        this.employeeid = number;
        this.isWorking = working;
    }
    
    public String getName() {
        return this.employeeName;
    }
    
    public int getEmployeeId() {
        return this.employeeid;
    }
    
    public boolean isWorking() {
        return this.isWorking;
    }
    
    public void setName (String name) {
        this.employeeName = name;
    }
    
    public void setEmloyeeId (int number) {
        this.employeeid = number;
    }
    
    public void setIsWorking (boolean employed) {
        this.isWorking = employed;
    }
    
    public abstract double getPay();
    
    public String toString() {
        return this.employeeName + "\t" + this.employeeid + "\t" + this.isWorking;
    }
}
