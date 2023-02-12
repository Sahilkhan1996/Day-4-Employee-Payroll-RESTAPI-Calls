package com.bridgelabz.employeepayrollapp.model;

import jakarta.persistence.*;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "EmployeePayroll")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" + "id=" + id + ", name='" + name + '\'' + ", salary='" + salary + '\'' + '}';
    }
}
