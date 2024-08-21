package com.example.mongo.firstdb.repository;

import com.example.mongo.firstdb.document.Table1Document;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Table1Repository extends MongoRepository<Table1Document, String> {
}
