package ru.access.demoaccess;

public class TableA {
    protected int id;
    protected String Name;
    protected int counter;
    protected int department;

    protected boolean delivToTwo;

    public TableA(int id, String name, int counter, int department) {
        this.id = id;
        this.Name = name;
        this.counter = counter;
        this.department = department;
        this.delivToTwo = getDelivToTwo(counter);
    }

    public boolean isDelivToTwo() {
        return this.delivToTwo;
    }

    public boolean getDelivToTwo(int counter) {
        return (counter % 2 == 0);
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
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
        this.setDelivToTwo(counter);
    }

    private void setDelivToTwo(int counter) {
        this.delivToTwo = getDelivToTwo(counter);
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "TableA{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", counter=" + counter +
                ", department=" + department +
                ", delivToTwo=" + delivToTwo +
                '}';
    }
}
