package com.sameddine.cmsrest.repositories;

import com.sameddine.cmsrest.domain.Receivable;
import com.sameddine.cmsrest.domain.ReceivableBeans.RecAgeBucketGroupAmountSum;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by seddine on 1/28/2017.
 */
public interface RecAgeBucketGroupAmountSumRepository extends CrudRepository<RecAgeBucketGroupAmountSum, Integer> {

    RecAgeBucketGroupAmountSum findByRecid(@Param("recid")Integer recid);

    List<RecAgeBucketGroupAmountSum> findByAgebucket(@Param("agebucket")String agebucket);

    @Query(value = "SELECT r.agebucket, sum(r.amount) as totalamount from Receivable as r GROUP BY r.agebucket", nativeQuery=true)
    List<RecAgeBucketGroupAmountSum> recAgeBucket();
}
