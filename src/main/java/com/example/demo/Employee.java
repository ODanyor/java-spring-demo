package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lustName;
    private String role;

    Employee() {}

    Employee(String firstName, String lustName, String role) {
        this.firstName = firstName;
        this.lustName = lustName;
        this.role = role;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return this.firstName + " " + this.lustName;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lustName = parts[1];
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lustName
     */
    public String getLustName() {
        return this.lustName;
    }

    /**
     * @param lustName the lustName to set
     */
    public void setLustName(String lustName) {
        this.lustName = lustName;
    }

    /**
     * @return String return the role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
  
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return //
            Objects.equals(this.id, employee.id) &&
            Objects.equals(this.firstName, employee.firstName) &&
            Objects.equals(this.lustName, employee.lustName) &&
            Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lustName, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + ", lustName='" + this.lustName + '\'' + ", role='" + this.role + '\'' + '}';
    }

}
