package ch02;

public class Student implements Cloneable
{

    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {  //object로 받기에 다운 캐스팅을 해줘야 함
//        return super.equals(obj);
        if(obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentId == std.studentId)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return studentId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
//        return super.toString();
        return studentName;
    }
}
