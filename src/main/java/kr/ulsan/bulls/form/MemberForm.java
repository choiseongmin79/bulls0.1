package kr.ulsan.bulls.form;

public class MemberForm {

    private String name;
    private String nickName;
    private String password;
    private String confPassword;
    private String address;
    private String birthday;
    private String cellPhone;
    private String memberType;
    private String farmName;
    private String farmAddress;
    private String farmPhone;
    private String farmNo;
    private String agencyName;
    private String agencyAddress;
    private String agencyPhone;
    private String agencyNo;
    private String officeName;
    private String officeAddress;
    private String officePhone;
    private String officeNo;

    public MemberForm(String name, String nickName, String password,
                      String confPassword, String address, String birthday,
                      String cellPhone, String memberType, String farmName,
                      String farmAddress, String farmPhone, String farmNo,
                      String agencyName, String agencyAddress, String agencyPhone,
                      String agencyNo, String officeName, String officeAddress,
                      String officePhone, String officeNo) {
        this.name = name;
        this.nickName = nickName;
        this.password = password;
        this.confPassword = confPassword;
        this.address = address;
        this.birthday = birthday;
        this.cellPhone = cellPhone;
        this.memberType = memberType;
        this.farmName = farmName;
        this.farmAddress = farmAddress;
        this.farmPhone = farmPhone;
        this.farmNo = farmNo;
        this.agencyName = agencyName;
        this.agencyAddress = agencyAddress;
        this.agencyPhone = agencyPhone;
        this.agencyNo = agencyNo;
        this.officeName = officeName;
        this.officeAddress = officeAddress;
        this.officePhone = officePhone;
        this.officeNo = officeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getFarmAddress() {
        return farmAddress;
    }

    public void setFarmAddress(String farmAddress) {
        this.farmAddress = farmAddress;
    }

    public String getFarmPhone() {
        return farmPhone;
    }

    public void setFarmPhone(String farmPhone) {
        this.farmPhone = farmPhone;
    }

    public String getFarmNo() {
        return farmNo;
    }

    public void setFarmNo(String farmNo) {
        this.farmNo = farmNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyAddress() {
        return agencyAddress;
    }

    public void setAgencyAddress(String agencyAddress) {
        this.agencyAddress = agencyAddress;
    }

    public String getAgencyPhone() {
        return agencyPhone;
    }

    public void setAgencyPhone(String agencyPhone) {
        this.agencyPhone = agencyPhone;
    }

    public String getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(String agencyNo) {
        this.agencyNo = agencyNo;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }

    @Override
    public String toString() {
        return "MemberForm{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", confPassword='" + confPassword + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", memberType='" + memberType + '\'' +
                ", farmName='" + farmName + '\'' +
                ", farmAddress='" + farmAddress + '\'' +
                ", farmPhone='" + farmPhone + '\'' +
                ", farmNo='" + farmNo + '\'' +
                ", agencyName='" + agencyName + '\'' +
                ", agencyAddress='" + agencyAddress + '\'' +
                ", agencyPhone='" + agencyPhone + '\'' +
                ", agencyNo='" + agencyNo + '\'' +
                ", officeName='" + officeName + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", officeNo='" + officeNo + '\'' +
                '}';
    }
}
