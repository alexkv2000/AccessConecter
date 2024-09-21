package ru.access.demoaccess;

public class TableA {
    protected int id;
    protected String Name;
    protected int counter;
    protected int department;

    public TableA(int id, String name, int counter, int department) {
        this.id = id;
        this.Name = name;
        this.counter = counter;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
