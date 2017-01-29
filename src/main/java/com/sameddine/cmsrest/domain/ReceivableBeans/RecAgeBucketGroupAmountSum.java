package com.sameddine.cmsrest.domain.ReceivableBeans;

import com.sameddine.cmsrest.domain.Receivable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by seddine on 1/17/2017.
 */
@Entity
public class RecAgeBucketGroupAmountSum {

    @Id
    private Integer recid;

    @Column
    private String agebucket;

    @Transient
    private Double amountsum;

    public Integer getRecid() {
        return recid;
    }

    public void setRecid(Integer recid) {
        this.recid = recid;
    }

    public String getAgebucket() {
        return agebucket;
    }

    public void setAgebucket(String agebucket) {
        this.agebucket = agebucket;
    }

    public Double getAmountsum() {
        return amountsum;
    }

    public void setAmountsum(Double amountsum) {
        this.amountsum = amountsum;
    }

    public RecAgeBucketGroupAmountSum(Integer recid, String agebucket, Double amountsum) {
        this.recid = recid;
        this.agebucket = agebucket;
        this.amountsum = amountsum;
    }

    public RecAgeBucketGroupAmountSum(Integer recid, String agebucket) {
        this.recid = recid;
        this.agebucket = agebucket;
    }

    protected RecAgeBucketGroupAmountSum(){}

    @Override
    public String toString() {
        return "RecAgeBucketGroupAmountSum{" +
                "recid=" + recid +
                ", agebucket='" + agebucket + '\'' +
                ", amountsum=" + amountsum +
                '}';
    }
}
