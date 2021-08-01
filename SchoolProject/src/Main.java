/*Using Your new Classes

        Add 10 students to student list
        add 3 teachers to teacher list
        display both lists
        remove 2 students
        remove 1 teacher
        display both lists*/

public class Main {

    public static void main(String[] args) {
        School school = new School();//create objects
        Teacher teacher = new Teacher ();
        Student student = new Student ();
        //cannot find a method or an arraylist from another class
        school.addTeacher("bob","Lee","math");
        school.showTeacher();







    }

}
