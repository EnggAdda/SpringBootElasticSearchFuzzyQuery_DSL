package com.example.springbootelasticsearchfuzzyquery_dsl.repo;



import com.example.springbootelasticsearchfuzzyquery_dsl.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {



        }
