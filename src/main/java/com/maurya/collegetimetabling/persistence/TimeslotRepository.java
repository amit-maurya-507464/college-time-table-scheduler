/*
 * Copyright(c) 2021, Developer : Amit Maurya
 */

package com.maurya.collegetimetabling.persistence;

import java.util.List;

import com.maurya.collegetimetabling.domain.Timeslot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeslotRepository extends JpaRepository<Timeslot, Long> {

    @Override
    List<Timeslot> findAll();

}
