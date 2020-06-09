package com.qakj.crm.pojo;

public class Addresslist {
    private Integer id;

    private String name;

    private String phone;

    private String email;

    private String depart;

    private String departno;
      
    private Communicationmgt communicationmgt;
    
    
    public Communicationmgt getCommunicationmgt() {
		return communicationmgt;
	}

	public void setCommunicationmgt(Communicationmgt communicationmgt) {
		this.communicationmgt = communicationmgt;
	}

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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