/*Fields

        first name
        last name
        subject

        Methods
        Appropriate Constructor
        When teacher object printed : Name: name Subject: subject(写一个override的东西）
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



}
