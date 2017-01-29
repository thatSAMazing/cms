package com.sameddine.cmsrest.services;

import com.sameddine.cmsrest.domain.Receivable;
import com.sameddine.cmsrest.repositories.ReceivableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by seddine on 1/10/2017.
 */
@Service
public class ReceivableService {
    private ReceivableRepository receivableRepository;

    @Autowired
    public ReceivableService(ReceivableRepository receivableRepository) {
        this.receivableRepository = receivableRepository;
    }

    public Receivable createReceivable(Integer recid, Date receivabledate, Float amount, String agebucket, String region){
        if(!receivableRepository.exists(recid)){
            receivableRepository.save(new Receivable(recid,receivabledate,amount,agebucket,region));
        }
        return null;
    }

    public Iterable<Receivable> lookup(){
        return receivableRepository.findAll();
    }

    public Long total(){
        return receivableRepository.count();
    }

    public List<Receivable> recByAgeBucket(){
        return receivableRepository.recByAgeBucket();
    }


}
