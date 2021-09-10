package kr.ulsan.bulls.dto;

import org.springframework.stereotype.Component;

public class Farm {
    private Long id;
    private String name;
    private String farmno;
    private String address;
    private String phone;
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

    public String getFarmno() {
        return farmno;
    }

    public void setFarmno(String farmno) {
        this.farmno = farmno;
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
        return "Farm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", farmno='" + farmno + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", membertype='" + membertype + '\'' +
                ", ownid=" + ownid +
                '}';
    }
}
