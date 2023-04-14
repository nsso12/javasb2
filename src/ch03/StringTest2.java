package ch03;

public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String ("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);  // concat : 문자열을 합쳐주는 메소드

        System.out.println(java);
        System.out.println(System.identityHashCode(java));
    }
}
