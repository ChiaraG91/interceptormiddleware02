package com.interceptormiddleware02.interceptormiddleware02.repositories;

import com.interceptormiddleware02.interceptormiddleware02.entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<Month, Long> {
}
