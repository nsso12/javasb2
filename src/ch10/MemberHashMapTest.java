package ch10;

public class MemberHashMapTest {
    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(1001, "소현");
        Member member2 = new Member(1002, "지민");
        Member member3 = new Member(1003, "진경");
        Member member4 = new Member(1004, "태윤");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.addMember(member4);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1002);
        memberHashMap.showAllMember();

    }
}
