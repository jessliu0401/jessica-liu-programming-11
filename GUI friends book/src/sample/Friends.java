package sample;

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



public String toString(){
        return name;
}

    }

