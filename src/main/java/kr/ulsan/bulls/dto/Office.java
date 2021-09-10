package kr.ulsan.bulls.dto;

import org.springframework.stereotype.Component;

public class Office {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String officeNo;
    private String membertype;
    private Long ownid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }

    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        this.membertype = membertype;
    }

    public Long getOwnid() {
        return ownid;
    }

    public void setOwnid(Long ownid) {
        this.ownid = ownid;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", officeNo='" + officeNo + '\'' +
                ", membertype='" + membertype + '\'' +
                ", ownid=" + ownid +
                '}';
    }
}
