package com.qakj.crm.pojo;

public class Communicationmgt {
    private Integer id;

    private String name;

    private String address;

    private String depart;

    private String departno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public String getDepartno() {
        return departno;
    }

    public void setDepartno(String departno) {
        this.departno = departno == null ? null : departno.trim();
    }
}