package com.sameddine.cmsrest.repositories;

import com.sameddine.cmsrest.domain.Receivable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

/**
 * Created by seddine on 1/10/2017.
 */
public interface ReceivableRepository extends CrudRepository<Receivable,Integer> {
    Receivable findByRecid(@Param("recid")Integer recid);

    List<Receivable> findByAgebucket(@Param("agebucket")String agebucket);

    @Query(value = "SELECT r.*, sum(r.amount) as totalamount from Receivable as r GROUP BY r.agebucket", nativeQuery=true)
    List<Receivable> recByAgeBucket();



}
