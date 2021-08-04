/*Fields

        Holds an ArrayList of Teachers
        Holds an ArrayList of students
        Holds an ArrayList of Courses
        3 fields of your choosing (example name) with setters and getter

        Methods
        Add a teacher to list
        Add a student to list
        Delete teacher from list
        Delete student from list
        Show all Teachers(can add stuff to teacher list but cannot print the teacher arraylist)
        Show all Students
        Appropriate constructor*/

import java.util.ArrayList;

public class School {



    // constructor
    School() {
        schoolSize = 1600;
        schoolName = "Sunny Secondary School";
        schoolNumber = 20;
    }

    //fields
    int schoolSize;
    String schoolName;
    int schoolNumber;
    //add array list
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Courses> courses = new ArrayList<>();

    // getters and setters
    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }


    //add teacher to list method
    public void oneTeacher (String firstname, String lastname, String subject) {
        teachers.add(new Teacher(firstname, lastname, subject));

    }


    //delete teacher from list method
public void deleteTeacher(int index){
        teachers.remove(index);
}
    // add student to list method
    public void oneStudent(String firstname, String lastname, int grade){
        students.add(new Student(firstname,lastname,grade));


    }

//add 10 students to list
    public void tenStudent(){
        for (int i = 0; i < 10; i++) {
            students.add(new Student());
        }
    }

//delete student from list
public void deleteStudent(int ID){
        students.remove(ID);
}
    //show all teachers(how to return arraylist)
    public void showTeacher() {
        System.out.println(teachers);


    }

    //show all students
    public void showStudents() {
        System.out.println(students);
    }
}






