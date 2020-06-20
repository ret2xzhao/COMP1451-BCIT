package three;

import java.util.HashMap;

public class School
{
    private HashMap<String, Student> students;

    public School()
    {
        students = new HashMap<>();

        String sn1 = "11111111111111";
        Student s1 = new Student(sn1, "aaaaaaaaa", 2001);

        String sn2 = "2222222222222";
        Student s2 = new Student(sn2, "bbbbbbbbbb", 2002);

        String sn3 = "333333";
        Student s3 = new Student(sn3, "ccccccccc", 2003);

        // ArrayList has RAGS methods
        // HashMap has RPGS methods
        students.put(sn1, s1);
        students.put(sn2, s2);
        students.put(sn3, s3);

        System.out.println(students);
    }

    /**
     *  @param studentId the student ID of the student being returned
     *  @return the student being sought, or null if there is no such student ID
     */
    public Student getStudentById(String studentId)
    {
        if(students.containsKey(studentId))
        {
            return students.get(studentId);
        }
        return null;
    }
}