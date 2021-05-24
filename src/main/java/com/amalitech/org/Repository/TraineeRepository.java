package com.amalitech.org.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amalitech.org.Entity.Trainee;
@Repository
public interface TraineeRepository extends JpaRepository<Trainee, Integer>{

}
