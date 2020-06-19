/*
package com.spring.stock.resources;

import com.spring.stock.entities.CategoryBackup;
import com.spring.stock.services.CategoryServiceBackup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResourceBackup {

    @Autowired
    private CategoryServiceBackup service;

    @GetMapping
    public ResponseEntity<List<CategoryBackup>> findAll(){
        List<CategoryBackup> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryBackup> findById(@PathVariable Long id){
        CategoryBackup obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
*/
