/*
 * Copyright(c) 2021, Developer : Amit Maurya
 */

package com.maurya.collegetimetabling.persistence;

import java.util.List;

import com.maurya.collegetimetabling.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

    @Override
    List<Room> findAll();

}
