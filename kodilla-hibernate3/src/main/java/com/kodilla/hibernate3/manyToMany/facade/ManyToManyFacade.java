package com.kodilla.hibernate3.manyToMany.facade;

import com.kodilla.hibernate3.manyToMany.Company;
import com.kodilla.hibernate3.manyToMany.Employee;
import com.kodilla.hibernate3.manyToMany.dao.CompanyDao;
import com.kodilla.hibernate3.manyToMany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.AttributeOverride;
import javax.persistence.NamedQuery;
import java.util.List;

@Service
public final class ManyToManyFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> findCompaniesByPartialName(String nameFragment){
        return companyDao.retriveCompaniesWithPartialName(nameFragment);
    }

    public List<Employee> findEmployesByPartialName(String nameFragment){
        return employeeDao.retriveEmployeeWithPartialName(nameFragment);
    }



}