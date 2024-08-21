package com.example.mongo.config;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(
        basePackages = "com.example.mongo.seconddb.repository",
        mongoTemplateRef = "secondMongoTemplate"
)
public class SecondDBConfig {

    @Bean
    public MongoClient secondMongoClient() {
        return MongoClients.create("mongoDB URI");
    }

    @Bean
    public MongoDatabaseFactory secondDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(secondMongoClient(), "testdb2");
    }

    @Bean
    public MongoTemplate secondMongoTemplate() {
        return new MongoTemplate(secondDatabaseFactory());
    }
}