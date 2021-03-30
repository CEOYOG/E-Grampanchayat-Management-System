package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.pojos.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
