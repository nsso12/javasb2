package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student Lee = new Student(100, "Lee");
        Student Lee2 = Lee;   // 같은 주소값을 가짐
        Student Shun = new Student(100, "Lee");

        Student Lees = (Student)Lee.clone();
        //student 클래스에서 clone 메서드의 반환값이 object이기에 다운캐스팅

        System.out.println(Lees.toString());

        System.out.println(Lee.hashCode());
        System.out.println(Shun.hashCode());

        //오버라이딩 되지 않은 원래의 hashCode(주소값_을 확인하고 싶을 때
        System.identityHashCode(Lee);
        System.identityHashCode(Shun);

        System.out.println(System.identityHashCode(Lee));
        System.out.println(System.identityHashCode(Shun));

        System.out.println(Lee.equals(Lee2));
        System.out.println(Lee == Lee2);  // 주소값이 같을 땐 이렇게 표현 가능
        System.out.println(Lee.equals(Shun));  // 같은 학생
        System.out.println(Lee == Shun);  // 주소값이 다르기에


        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1.equals(str2));  // String 값이 같기에 equals는 true
        System.out.println(str1 == str2);   // new를 한 각각의 인스턴스이기에 메모리가 다르기에 false

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
