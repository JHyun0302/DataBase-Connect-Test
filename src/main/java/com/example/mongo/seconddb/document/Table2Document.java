package com.example.mongo.seconddb.document;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "table2")
@Data
public class Table2Document {

    @Id
    private String _id;

    private String data;
}
