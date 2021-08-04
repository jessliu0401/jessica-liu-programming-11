public class Student {
    /*Fields
    first name
    last name
    grade
    unique student number created on construction

    Methods
    getters and setters
    Appropriate Constructor
    When printed "Name: name Grade: grade*/

    // fields
    String firstName;
    String lastName;
    int grade;
    int studentID;//number students get
    static int studentNum;//used to put different student with different student ID

    Student(){
        firstName = "";
        lastName = "";
        grade = 9;
        studentID = studentNum;
        studentNum ++;

    }
    //constructor
    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentID = studentNum;
        studentNum++;
    }

    //getter setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    //override
    public String toString(){
        return "Name:"+ this.firstName + " " + this.lastName + " grade:" + this.grade + " student ID:" + studentID + "  ";
    }
}
