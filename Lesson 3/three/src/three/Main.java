package three;

public class Main {

    public static void main(String[] args) {
        School school = new School();
        System.out.println(school.getStudentById("23412352345"));
        System.out.println(school.getStudentById("2222222222222"));
        Student s3 = school.getStudentById("333333");
        System.out.println(s3.getYearBorn());
    }
}