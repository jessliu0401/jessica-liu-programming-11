package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teacher {
    String lastName;
    int salary;
//constructor
    public Teacher(String lastname, int salary){
        this.lastName = lastname;
        this.salary = salary;
    }
//write payments to teachers to file
    public void writeToFile(String fileName) throws IOException {
        FileWriter fwrite = new FileWriter(fileName,true);
        BufferedWriter bwrite = new BufferedWriter(fwrite);
        bwrite.write(lastName + ",\r");
        bwrite.write(Integer.toString(salary)+"\r");
        bwrite.write(";\r");
        bwrite.close();
    }
//override
    public String toString(){
        return "Pay to " + lastName + "\t\t" + salary + "$";
    }
//getter
    public int getSalary() {
        return salary;
    }
}
