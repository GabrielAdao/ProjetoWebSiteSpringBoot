package com.spring.stock.services;

import com.spring.stock.entities.Product;
import com.spring.stock.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){ return repository.findAll();}

    public Product findById (Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

    public Product insert(Product obj){
        return repository.save(obj);
    }

    public void delete (Long id){
        repository.deleteById(id);
    }

    public Product update (Long id, Product obj){
        Product entity = repository.getOne(id);
        updateData(entity,obj);
        return repository.save(entity);
    }

    public void updateData (Product entity, Product obj){
        entity.setName(obj.getName());
        entity.setQuantity(obj.getQuantity());
        entity.setMeasure(obj.getMeasure());
        entity.setDescription(obj.getDescription());
    }
}