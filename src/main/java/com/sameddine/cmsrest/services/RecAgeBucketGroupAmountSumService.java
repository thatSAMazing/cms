package com.sameddine.cmsrest.services;

import com.sameddine.cmsrest.domain.Receivable;
import com.sameddine.cmsrest.domain.ReceivableBeans.RecAgeBucketGroupAmountSum;
import com.sameddine.cmsrest.repositories.RecAgeBucketGroupAmountSumRepository;
import com.sameddine.cmsrest.repositories.ReceivableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by seddine on 1/28/2017.
 */
@Service
public class RecAgeBucketGroupAmountSumService {
    private RecAgeBucketGroupAmountSumRepository recAgeBucketGroupAmountSumRepository;

    @Autowired
    public RecAgeBucketGroupAmountSumService(RecAgeBucketGroupAmountSumRepository recAgeBucketGroupAmountSumRepository) {
        this.recAgeBucketGroupAmountSumRepository = recAgeBucketGroupAmountSumRepository;
    }

    public RecAgeBucketGroupAmountSum createRecAgeBucketGroupAmountSum(Integer recid, String agebucket){
        if(!recAgeBucketGroupAmountSumRepository.exists(recid)){
            recAgeBucketGroupAmountSumRepository.save(new RecAgeBucketGroupAmountSum(recid, agebucket));
        }
        return null;
    }

    public List<RecAgeBucketGroupAmountSum> recByAgeBucket(){
        return recAgeBucketGroupAmountSumRepository.recAgeBucket();
    }
}
