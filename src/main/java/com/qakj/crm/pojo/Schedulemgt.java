package com.qakj.crm.pojo;

public class Schedulemgt {
    private Integer id;

    private String nineclock;

    private String twelveclock;

    private String fourteenclock;

    private String seventeenclock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNineclock() {
        return nineclock;
    }

    public void setNineclock(String nineclock) {
        this.nineclock = nineclock == null ? null : nineclock.trim();
    }

    public String getTwelveclock() {
        return twelveclock;
    }

    public void setTwelveclock(String twelveclock) {
        this.twelveclock = twelveclock == null ? null : twelveclock.trim();
    }

    public String getFourteenclock() {
        return fourteenclock;
    }

    public void setFourteenclock(String fourteenclock) {
        this.fourteenclock = fourteenclock == null ? null : fourteenclock.trim();
    }

    public String getSeventeenclock() {
        return seventeenclock;
    }

    public void setSeventeenclock(String seventeenclock) {
        this.seventeenclock = seventeenclock == null ? null : seventeenclock.trim();
    }
}