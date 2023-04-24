package ch09;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001, "진경");
        Member member2 = new Member(1002, "소현");
        Member member3 = new Member(1003, "지민");
        Member member4 = new Member(1004, "효정");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);

        memberArrayList.showAllMember();

        memberArrayList.removeMember((member4.getMemberId()));
        memberArrayList.showAllMember();

    }
}
