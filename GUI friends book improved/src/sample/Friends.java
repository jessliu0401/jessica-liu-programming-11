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

//get set
        public String getName() {
            return name; }

        public void setName(String Name) {
            this.name = Name; }

        public int getPhoneNum() {
            return phoneNum; }

        public void setPhoneNum(int phoneNum) {
            this.phoneNum = phoneNum; }

public void writeToFile() throws IOException{
    FileWriter fwrite = new FileWriter("friends.txt",true);
    BufferedWriter bwrite = new BufferedWriter(fwrite);
    bwrite.write(name + ",\r");
    bwrite.write(Integer.toString(phoneNum)+"\r");
    bwrite.close();
}
//tostirng
public String toString(){
        return name;
}

    }

