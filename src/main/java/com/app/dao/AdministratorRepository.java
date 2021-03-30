package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {

}
