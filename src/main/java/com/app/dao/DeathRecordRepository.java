package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.pojos.DeathRecord;

public interface DeathRecordRepository extends JpaRepository<DeathRecord, Integer> {

}
