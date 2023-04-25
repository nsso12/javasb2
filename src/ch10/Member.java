package ch10;

public class Member implements Comparable<Member> {
    private int memberId;

    @Override
    public int compareTo(Member member) {
//        return (this.memberId - member.memberId); // 오름차순
        return (this.memberId - member.memberId) * (-1); // 내림차순

        // element가 하나 추가될 때마다 비교를 하는데 추가되는애가 this
        // this가 더 클 때 양수를 반환하면 오름차순, 음수를 반환하면 내림차순
    }

    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "회원님의 아이디는 " + memberId + "입니다";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member)obj;
            if(this.memberId == member.memberId)
                return true;
            else
                return false;
        }
        return false;
    }
}
