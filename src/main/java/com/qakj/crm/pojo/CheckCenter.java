package com.qakj.crm.pojo;

import java.util.Date;

public class CheckCenter {
    private String suppliername;

    private String commodityname;

    private Date manufacturedate;

    private Date expire;

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Date getManufacturedate() {
        return manufacturedate;
    }

    public void setManufacturedate(Date manufacturedate) {
        this.manufacturedate = manufacturedate;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }
}