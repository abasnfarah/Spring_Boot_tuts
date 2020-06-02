package com.pluralsight.SpringBoot_Conferencedemo.repositories;

import com.pluralsight.SpringBoot_Conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
