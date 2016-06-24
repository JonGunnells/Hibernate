package com.theironyard;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PurchaseRepository extends CrudRepository<Purchase, Integer>{
    List<Purchase> findByCategory(String category);
}
