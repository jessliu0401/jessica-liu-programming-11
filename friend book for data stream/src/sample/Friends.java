package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friends {
    //fields
   private String name;
    private int phoneNum;

    Friends(String name, int phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;}

    public String getName() {
        return name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void writeToFile(String fileName) throws IOException {
        FileWriter fwrite = new FileWriter(fileName,true);
        BufferedWriter bwrite = new BufferedWriter(fwrite);
        bwrite.write(name + ",\r");
        bwrite.write(Integer.toString(phoneNum)+"\r");
        bwrite.write(";\r");
        bwrite.close();
    }

    //debug list so it does not load repeat products
    public boolean compareFriend (Friends f){
        if(this.name.equals(f.name)){
            return true;
        }
        else return false;
    }



public String toString(){
        return name;
}

    }

