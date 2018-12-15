package com.kodilla.hibernate3.manyToMany;

import org.dom4j.io.ElementModifier;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompaniesWithNameLike",
        query = "SELECT * FROM Companies WHERE SUBSTRING(COMPANY_NAME,1,3) = :NAME",
        resultClass = Company.class
)

@NamedQuery(
        name = "Company.retriveCompaniesWithPartialName",
        query = "FROM Company WHERE name LIKE CONCAT(\'%\', :NAME, \'%\')"
)

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company(){
    }

    public Company(String name){
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId(){
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName(){
        return name;
    }
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees(){
        return employees;
    }

    private void setEmployees(List<Employee> employees){
        this.employees = employees;
    }

    private void setId(int id){
        this.id = id;
    }

    private void setName(String name){
        this.name = name;
    }
}
