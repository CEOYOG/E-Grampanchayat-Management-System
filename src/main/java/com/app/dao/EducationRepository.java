package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.pojos.Education;

public interface EducationRepository extends JpaRepository<Education, Integer> {

}
