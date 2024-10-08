package com.example.mongo.firstdb.document;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "table1")
@Data
public class Table1Document {

    @Id
    private String _id;

    private String data;
}
