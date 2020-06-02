package com.pluralsight.SpringBoot_Conferencedemo.repositories;

import com.pluralsight.SpringBoot_Conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
