

/*
 * Copyright(c) 2021, Developer : Amit Maurya
 */

package com.maurya.collegetimetabling;

import java.time.DayOfWeek;
import java.time.LocalTime;

import com.maurya.collegetimetabling.domain.Lesson;
import com.maurya.collegetimetabling.domain.Room;
import com.maurya.collegetimetabling.domain.Timeslot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;

import com.maurya.collegetimetabling.persistence.LessonRepository;
import com.maurya.collegetimetabling.persistence.RoomRepository;
import com.maurya.collegetimetabling.persistence.TimeslotRepository;

@SpringBootApplication
public class TimeTableSpringBootApp {

    public static void main(String[] args) {
        SpringApplication.run(TimeTableSpringBootApp.class, args);
    }

    @Value("${timeTable.demoData}")
    private DemoData demoData;

    @Bean
    public CommandLineRunner demoData(
            TimeslotRepository timeslotRepository,
            RoomRepository roomRepository,
            LessonRepository lessonRepository) {
        return (args) -> {
            if (demoData == DemoData.NONE) {
                return;
            }

            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.MONDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
            timeslotRepository.save(new Timeslot(DayOfWeek.TUESDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
            if (demoData == DemoData.LARGE) {
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.WEDNESDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.THURSDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(8, 30), LocalTime.of(9, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(9, 30), LocalTime.of(10, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(10, 30), LocalTime.of(11, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(13, 30), LocalTime.of(14, 30)));
                timeslotRepository.save(new Timeslot(DayOfWeek.FRIDAY, LocalTime.of(14, 30), LocalTime.of(15, 30)));
            }

            roomRepository.save(new Room("Room A"));
            roomRepository.save(new Room("Room B"));
            roomRepository.save(new Room("Room C"));
            if (demoData == DemoData.LARGE) {
                roomRepository.save(new Room("Room D"));
                roomRepository.save(new Room("Room E"));
                roomRepository.save(new Room("Room F"));
            }

            lessonRepository.save(new Lesson("DBMS", "Renu Saini", "BCA"));
            lessonRepository.save(new Lesson("DBMS", "Renu Saini", "BCA"));
            lessonRepository.save(new Lesson("Java", "Geetika Gehlot", "BCA"));
            lessonRepository.save(new Lesson("HTML", "Geetika Gehlot", "BCA"));
            lessonRepository.save(new Lesson("Software Engineering", "Renu Saini", "BCA"));
            lessonRepository.save(new Lesson("Python", "Neelam Dahiya", "BCA"));
            lessonRepository.save(new Lesson("Digital Electronics", "Neelam Dahiya", "BCA"));
            lessonRepository.save(new Lesson("Digital Electronics", "Neelam Dahiya", "BCA"));
            lessonRepository.save(new Lesson("IOT", "Venu Azad", "BCA"));
            lessonRepository.save(new Lesson("IOT", "Rajesh Kumar", "BCA"));
            if (demoData == DemoData.LARGE) {
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "BCA"));
                lessonRepository.save(new Lesson("DBMS", "Renu Saini", "BCA"));
                lessonRepository.save(new Lesson("DBMS", "Renu Saini", "BCA"));
                lessonRepository.save(new Lesson("Data Structure", "Rakhi Soni", "BCA"));
                lessonRepository.save(new Lesson("Java", "Geetika Gehlot", "BCA"));
                lessonRepository.save(new Lesson("DBMS", "Renu Saini", "BCA"));
                lessonRepository.save(new Lesson("Computer Networks", "Renu Saini", "BCA"));
                lessonRepository.save(new Lesson("Python", "Neelam Dahiya", "BCA"));
                lessonRepository.save(new Lesson("Digital Electronics", "Neelam Dahiya", "BCA"));
                lessonRepository.save(new Lesson("C++", "Neelam Dahiya", "BCA"));
                lessonRepository.save(new Lesson("C Language", "Kanta Rana", "BCA"));
                lessonRepository.save(new Lesson("C Language", "Kanta Rana", "BCA"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "BCA"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "BCA"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "BCA"));
            }

            lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "MCA"));
            lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "MCA"));
            lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "MCA"));
            lessonRepository.save(new Lesson("Java", "Geetika Gehlot", "MCA"));
            lessonRepository.save(new Lesson("HTML", "Geetika Gehlot", "MCA"));
            lessonRepository.save(new Lesson("Computer Graphics", "Geetika Gehlot", "MCA"));
            lessonRepository.save(new Lesson("DBMS", "Renu Saini", "MCA"));
            lessonRepository.save(new Lesson("Python", "Neelam Dahiya", "MCA"));
            lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "MCA"));
            lessonRepository.save(new Lesson("IOT", "Rajesh Kumar", "MCA"));
            if (demoData == DemoData.LARGE) {
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "MCA"));
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "MCA"));
                lessonRepository.save(new Lesson("Data Structure", "Rakhi Soni", "MCA"));
                lessonRepository.save(new Lesson("Java", "Geetika Gehlot", "MCA"));
                lessonRepository.save(new Lesson("Software Engineering", "Renu Saini", "MCA"));
                lessonRepository.save(new Lesson("Computer Networks", "Renu Saini", "MCA"));
                lessonRepository.save(new Lesson("Python", "Neelam Dahiya", "MCA"));
                lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "MCA"));
                lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "MCA"));
                lessonRepository.save(new Lesson("C++", "Neelam Dahiya", "MCA"));
                lessonRepository.save(new Lesson("C Language", "Kanta Rana", "MCA"));
                lessonRepository.save(new Lesson("C Language", "Kanta Rana", "MCA"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "MCA"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "MCA"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "MCA"));

                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "B.COM"));
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "B.COM"));
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "B.COM"));
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "B.COM"));
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "B.COM"));
                lessonRepository.save(new Lesson("Data Structure", "Rakhi Soni", "B.COM"));
                lessonRepository.save(new Lesson("Java", "Geetika Gehlot", "B.COM"));
                lessonRepository.save(new Lesson("HTML", "Geetika Gehlot", "B.COM"));
                lessonRepository.save(new Lesson("Computer Graphics", "Geetika Gehlot", "B.COM"));
                lessonRepository.save(new Lesson("Java", "Geetika Gehlot", "B.COM"));
                lessonRepository.save(new Lesson("DBMS", "Renu Saini", "B.COM"));
                lessonRepository.save(new Lesson("Software Engineering", "Renu Saini", "B.COM"));
                lessonRepository.save(new Lesson("Computer Networks", "Renu Saini", "B.COM"));
                lessonRepository.save(new Lesson("Python", "Neelam Dahiya", "B.COM"));
                lessonRepository.save(new Lesson("Python", "Neelam Dahiya", "B.COM"));
                lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "B.COM"));
                lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "B.COM"));
                lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "B.COM"));
                lessonRepository.save(new Lesson("IOT", "Rajesh Kumar", "B.COM"));
                lessonRepository.save(new Lesson("C++", "Rajesh Kumar", "B.COM"));
                lessonRepository.save(new Lesson("C Language", "Kanta Rana", "B.COM"));
                lessonRepository.save(new Lesson("C Language", "Kanta Rana", "B.COM"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "B.COM"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "B.COM"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "B.COM"));

                lessonRepository.save(new Lesson("DBMS", "Renu Saini", "M.COM"));
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "M.COM"));
                lessonRepository.save(new Lesson("DBMS", "Renu Saini", "M.COM"));
                lessonRepository.save(new Lesson("Data Communication", "Rakhi Soni", "M.COM"));
                lessonRepository.save(new Lesson("DBMS", "Renu Saini", "M.COM"));
                lessonRepository.save(new Lesson("Data Structure", "Rakhi Soni", "M.COM"));
                lessonRepository.save(new Lesson("Java", "Geetika Gehlot", "M.COM"));
                lessonRepository.save(new Lesson("HTML", "Geetika Gehlot", "M.COM"));
                lessonRepository.save(new Lesson("Computer Graphics", "Geetika Gehlot", "M.COM"));
                lessonRepository.save(new Lesson("Java", "Geetika Gehlot", "M.COM"));
                lessonRepository.save(new Lesson("DBMS", "Renu Saini", "M.COM"));
                lessonRepository.save(new Lesson("Software Engineering", "Renu Saini", "M.COM"));
                lessonRepository.save(new Lesson("Computer Networks", "Renu Saini", "M.COM"));
                lessonRepository.save(new Lesson("Python", "Neelam Dahiya", "M.COM"));
                lessonRepository.save(new Lesson("Python", "Neelam Dahiya", "M.COM"));
                lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "M.COM"));
                lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "M.COM"));
                lessonRepository.save(new Lesson("Digital Electronics", "Venu Azad", "M.COM"));
                lessonRepository.save(new Lesson("IOT", "Rajesh Kumar", "M.COM"));
                lessonRepository.save(new Lesson("C++", "Rajesh Kumar", "M.COM"));
                lessonRepository.save(new Lesson("C Language", "Kanta Rana", "M.COM"));
                lessonRepository.save(new Lesson("C Language", "Kanta Rana", "M.COM"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "M.COM"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "M.COM"));
                lessonRepository.save(new Lesson("E Commerce", "C. Lewis", "M.COM"));
            }

            Lesson lesson = lessonRepository.findAll(Sort.by("id")).iterator().next();
            lesson.setTimeslot(timeslotRepository.findAll(Sort.by("id")).iterator().next());
            lesson.setRoom(roomRepository.findAll(Sort.by("id")).iterator().next());

            lessonRepository.save(lesson);
        };
    }

    public enum DemoData {
        NONE,
        SMALL,
        LARGE
    }

}
