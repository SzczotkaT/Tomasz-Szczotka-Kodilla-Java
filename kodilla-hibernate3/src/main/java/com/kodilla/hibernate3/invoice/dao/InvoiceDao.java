package com.kodilla.hibernate3.invoice.dao;

import com.kodilla.hibernate3.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface InvoiceDao extends CrudRepository<Item, Integer> {

}
