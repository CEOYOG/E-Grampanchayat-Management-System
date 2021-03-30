package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}
