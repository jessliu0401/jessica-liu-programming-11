package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Purchase {
    String itemName;
    int cost;
//constructor
    public Purchase(String itemName, int cost){
        this.itemName = itemName;
        this.cost = cost;
    }
//getter
    public int getCost() {
        return cost;
    }
//write purchases to txt file for later
    public void writeToFile(String fileName) throws IOException {
        FileWriter fwrite = new FileWriter(fileName,true);
        BufferedWriter bwrite = new BufferedWriter(fwrite);
        bwrite.write(itemName + ",\r");
        bwrite.write(Integer.toString(cost)+"\r");
        bwrite.write(";\r");
        bwrite.close();
    }
//override
    public String toString(){
        return itemName + "\t\t\t-" + " "+cost + "$";
    }
}

