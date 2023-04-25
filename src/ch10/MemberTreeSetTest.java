package ch10;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1003, "소현");
        Member member2 = new Member(1001, "지민");
        Member member3 = new Member(1002, "진경");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.showAllMember();
    }
}
