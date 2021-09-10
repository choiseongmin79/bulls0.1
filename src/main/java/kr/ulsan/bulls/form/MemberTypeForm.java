package kr.ulsan.bulls.form;

public class MemberTypeForm {
    private String memberType;

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "MemberTypeForm{" +
                "memberType='" + memberType + '\'' +
                '}';
    }
}
