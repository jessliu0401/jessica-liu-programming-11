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
        System.out.println("3 teacher and 10 students");
        //add 3 teacher to list
        school.oneTeacher("bob","lee","math");//???
        school.oneTeacher("tom","tommy","PE");
        school.oneTeacher("ming","shi","english");
        //print teacher list
        school.showTeacher();
        //add 10 student to list(for this part you can use the tenStudent method in the school class as well)
        //school.tenStudent();
        
        for(int i = 0; i < 10; i++){
            school.students.add(new Student());
        }
        //print student list
        school.showStudents();


        System.out.println("deletes 2 student and one teacher ");
        //remove two student from list(for whoever you want to remove, type in their id in method parameter)
        school.deleteStudent(2);
        school.deleteStudent(3);
        //remove one teacher from list(for whoever you want to remove, type their index position in the
        school.deleteTeacher(1);
        System.out.println(school.teachers);
        System.out.println(school.students);













    }

}
