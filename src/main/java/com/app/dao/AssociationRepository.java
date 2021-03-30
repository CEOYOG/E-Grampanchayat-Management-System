package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.pojos.Association;

public interface AssociationRepository extends JpaRepository<Association, Integer> {

}
