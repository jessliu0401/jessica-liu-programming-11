package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Funding {
    String patronName;
    int amount;

    //getter
    public String getPatronName() {
        return patronName;
    }

    public int getAmount() {
        return amount;
    }

    //********************************************************************************
    //constructor
    public Funding(String patronName, int amount) {
        this.patronName = patronName;
        this.amount = amount;
    }
//method to constuct a funding from ministry of education
    public Funding() {
        this.patronName = "Ministry of Ed";
        this.amount = 3000;
    }

//record stuff to the txt file so it could be pulled up later
    public void writeToFile(String fileName) throws IOException {
        FileWriter fwrite = new FileWriter(fileName,true);
        BufferedWriter bwrite = new BufferedWriter(fwrite);
        bwrite.write(patronName + ",\r");
        bwrite.write(Integer.toString(amount)+"\r");
        bwrite.write(";\r");
        bwrite.close();
    }


    //override
public String toString(){
        return patronName + "\t\t\t" + "+" + amount + "$";
    }
}


