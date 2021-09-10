package kr.ulsan.bulls.dto;

public class Agent {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String license;
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

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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
        return "Agent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", license='" + license + '\'' +
                ", membertype='" + membertype + '\'' +
                ", ownid=" + ownid +
                '}';
    }
}
