package com.hdbandit.orika_mapper;

public class Job {

    private String location;
    private int salary;
    private String category;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Job{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", category='" + category + '\'' +
                '}';
    }
}
