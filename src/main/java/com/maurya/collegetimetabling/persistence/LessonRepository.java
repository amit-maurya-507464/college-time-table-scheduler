/*
 * Copyright(c) 2021, Developer : Amit Maurya
 */

package com.maurya.collegetimetabling.persistence;

import java.util.List;

import com.maurya.collegetimetabling.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

    @Override
    List<Lesson> findAll();

}
