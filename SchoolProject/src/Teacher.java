/*Fields

        first name
        last name
        subject

        Methods
        Appropriate Constructor
        When teacher object printed : Name: name Subject: subject
        setters and getters*/

public class Teacher {
    //fields
    String firstName;
    String lastName;
    String subject;

    // methods
    //constructors
    Teacher (){
        firstName = "";
        lastName = "";
        subject = "TBD";

    }
        Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //set get

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //override to print teacher
    public String toString(){
        return "Name:"+ this.firstName + " " + this.lastName + " Subject: " + this.subject;
    }


}
