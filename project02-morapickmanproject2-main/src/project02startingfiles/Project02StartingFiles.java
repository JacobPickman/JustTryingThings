/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;
import java.util.*;
import java.io.*;
/**
 *
 * @author Antonio Mora and Jacob Pickman
 */
public class Project02StartingFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Antonio: Getting info from user 
        Scanner userInput = new Scanner (System.in);
        int numStu, numCS, numFac, t;
        String fileName;
        int count = 0;
        
        System.out.println("Enter File Name: ");
        fileName = userInput.next();
        System.out.println("\nEnter amount of Students: ");
        numStu = userInput.nextInt();
        System.out.println("\nEnter amount of Classified Staff: ");
        numCS = userInput.nextInt();
        System.out.println("\nEnter amount of Faculty: ");
        numFac = userInput.nextInt();
        t = numStu + numCS + numFac;
        
        userInput.close();
        
        //Antonio: File Work
        File file = new File (fileName);
        Scanner fileInput = new Scanner (file);
        
        //Antonio: Creating and Filling Array
        Employee[] workers = new Employee[t];
        
        while (fileInput.hasNextLine()) {
            String [] list = fileInput.nextLine().split(",");
            
            //Jacob: If employee is Student Employee
            if (count < numStu) {
                workers[count] = new StudentEmployee(list[0], Integer.parseInt(list[1]), Boolean.parseBoolean(list[2])
                                 ,Integer.parseInt(list[3]), Boolean.parseBoolean(list[4]), Double.parseDouble(list[5]));
            }
            //Jacob: If employee is Classified Staff
            else if (count >= numStu && count < numCS + numStu) {
                workers[count] = new ClassifiedStaff(list[0], Integer.parseInt(list[1]), Boolean.parseBoolean(list[2])
                                 ,Double.parseDouble(list[3]), list[4]);
            }
            //Jacob: If employee is Faculty
            else {
                workers[count] = new Faculty(list[0], Integer.parseInt(list[1]), Boolean.parseBoolean(list[2])
                                 ,Double.parseDouble(list[3]), Integer.parseInt(list[4]), list[5]);
            }
            count++;
        }
        System.out.println("\n");
        for (Employee worker: workers) {
            System.out.println(worker);
        }
        
        //Jacob: Pay Period Table
        System.out.println("\nPay for two-week pay period\n===========================");
        
        for (Employee worker: workers) {
            if (worker.isWorking()) {
                System.out.printf(worker.getName() + "\t$%.2f\n", worker.getPay());
            }
        }
    } 
}
