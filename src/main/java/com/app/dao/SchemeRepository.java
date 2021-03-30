package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.pojos.Scheme;

public interface SchemeRepository extends JpaRepository<Scheme, Integer> {

}
