package com.example.cloudcatalogservice.service;

import com.example.cloudcatalogservice.jpa.CatalogEntity;

import java.util.List;

public interface CatalogService {

    List<CatalogEntity> getAllCatalogs();

}
