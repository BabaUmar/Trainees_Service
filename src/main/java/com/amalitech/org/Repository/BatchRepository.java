package com.amalitech.org.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amalitech.org.Entity.Batch;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Integer>{

}
