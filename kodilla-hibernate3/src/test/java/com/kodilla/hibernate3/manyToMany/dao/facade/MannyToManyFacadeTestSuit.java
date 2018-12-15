package com.kodilla.hibernate3.manyToMany.dao.facade;

import com.kodilla.hibernate3.manyToMany.Company;
import com.kodilla.hibernate3.manyToMany.Employee;
import com.kodilla.hibernate3.manyToMany.dao.CompanyDao;
import com.kodilla.hibernate3.manyToMany.dao.EmployeeDao;
import com.kodilla.hibernate3.manyToMany.facade.ManyToManyFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class MannyToManyFacadeTestSuit {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    ManyToManyFacade manyToManyFacade;

    @Test
    public void testfindCompaniesByPartialName(){
        //Given
        Company ironMountain = new Company("Iron Mountain");
        companyDao.save(ironMountain);

        //When
        List<Company> byPartName = companyDao.retriveCompaniesWithPartialName("Mou");

        //Then
        Assert.assertEquals(ironMountain.getName(), byPartName.get(0).getName());
    }

    @Test
    public void testFindEmployeeWithPartialName(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);

        //When
        List<Employee> emL = employeeDao.retriveEmployeeWithPartialName("Sm");

        //Then
        Assert.assertEquals(johnSmith.getLastname(),emL.get(0).getLastname());
    }
}
