package com.kodilla.hibernate3.manyToMany.dao;

import com.kodilla.hibernate3.manyToMany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

}
