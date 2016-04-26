package ua.com.juja.Interviews.Epam.Epam_test_9;

import java.util.HashMap;

/**
 * Created by serzh on 4/26/16.
 */
public class ClassRoll {
    private HashMap students = new HashMap();

    private void addStudent(Student stud) {
        students.put(stud.getName(), stud);
    }

    private void removeStudent(Student stud) {
        students.remove(stud.getName());
    }

    public boolean changeRoll(int code, Student stud) { // я бы сделал метод синхронизированным.
        switch (code) {                                 // только он public и производит запись
            case 1: addStudent(stud); return true;
            case 2: removeStudent(stud); return true;
            default: return false;
        }
    }

    public boolean isInRoll(Student stud) {
        return students.containsKey(stud.getName());
    }
}

class Student {
    private Object name;

    public Student(Object name) {
        this.name = name;
    }

    public Object getName() {
        return name;
    }
}