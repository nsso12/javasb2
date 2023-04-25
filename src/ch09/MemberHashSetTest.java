package ch09;

public class MemberHashSetTest {
    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1001, "진경");
        Member member2 = new Member(1002, "소현");
        Member member3 = new Member(1003, "지민");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.showAllMember();

        System.out.println("======================");

        Member member4 = new Member(1001, "효정"); // 아이디중복
        memberHashSet.addMember(member4);
        memberHashSet.showAllMember();
    }
}
