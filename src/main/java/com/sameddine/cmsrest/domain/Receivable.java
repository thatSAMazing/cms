package com.sameddine.cmsrest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by seddine on 1/10/2017.
 */
@Entity
public class Receivable implements Serializable {

    @Id
    private Integer recid;

    @Column
    private Date receivabledate;

    @Column
    private Float amount;

    @Column
    private String agebucket;

    @Column
    private String region;

    @Transient
    private Float totalamount;


    public Integer getRecid() {
        return recid;
    }

    public void setRecid(Integer recid) {
        this.recid = recid;
    }

    public Date getReceivabledate() {
        return receivabledate;
    }

    public void setReceivabledate(Date receivabledate) {
        this.receivabledate = receivabledate;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getAgebucket() {
        return agebucket;
    }

    public void setAgebucket(String agebucket) {
        this.agebucket = agebucket;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    protected Receivable(){}

    public Receivable(Integer recid, Date receivabledate, Float amount, String agebucket, String region) {
        this.recid = recid;
        this.receivabledate = receivabledate;
        this.amount = amount;
        this.agebucket = agebucket;
        this.region = region;
    }

    public Receivable(String agebucket, Float totalamount) {
        this.agebucket = agebucket;
        this.totalamount = totalamount;
    }

    @Override
    public String toString() {
        return "Receivable{" +
                "recid=" + recid +
                ", receivabledate=" + receivabledate +
                ", amount=" + amount +
                ", agebucket='" + agebucket + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}