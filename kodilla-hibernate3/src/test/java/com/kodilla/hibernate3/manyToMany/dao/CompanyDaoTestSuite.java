package com.kodilla.hibernate3.manyToMany.dao;


import com.kodilla.hibernate3.manyToMany.Company;
import com.kodilla.hibernate3.manyToMany.Employee;
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
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
    }

    @Test
    public void testRetriveEmployeeWithLastnameIs(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);

        //When
        List<Employee> emL = employeeDao.retriveEmployeeWithLastnameIs("Smith");

        //Then
        Assert.assertEquals(johnSmith.getLastname(),emL.get(0).getLastname());
    }

    @Test
    public void testretriveCompanyNameWhere3FirstLettersAre(){
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company softTouch = new Company("Soft Touch");
        companyDao.save(softwareMachine);
        companyDao.save(softTouch);

        //When
        List<Company> cm3 = companyDao.retrieveCompaniesWithNameLike("Sof");

        //Then
        Assert.assertEquals(softwareMachine.getName(), cm3.get(0).getName());
        Assert.assertEquals(softTouch.getName(), cm3.get(1).getName());
    }
}
