package ch11;

@FunctionalInterface
interface PrintString{
    public void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {

        // 람다식을 변수에 대입한 경우
        PrintString printString = str-> System.out.println(str);
        printString.showString("Hello");


        //매개변수로 전달하는 람다식
        showMyString(printString);


        // 반환 값으로 쓰이는 람다식
        PrintString myString = returnString();
        myString.showString("Hello");
    }

    public static void showMyString(PrintString str) {
        str.showString("Hi");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + ", Cheeze" );
    }
}
