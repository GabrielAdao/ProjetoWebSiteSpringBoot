/*
package com.spring.stock.services;

import com.spring.stock.entities.CategoryBackup;
import com.spring.stock.respositories.CategoryRepositoryBackup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceBackup {
    @Autowired
    private CategoryRepositoryBackup repository;

    public List<CategoryBackup> findAll(){ return repository.findAll();}

    public CategoryBackup findById (Long id){
        Optional<CategoryBackup> obj = repository.findById(id);
        return obj.get();
    }
}
*/
