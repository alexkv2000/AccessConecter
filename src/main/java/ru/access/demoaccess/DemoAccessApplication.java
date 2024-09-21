package ru.access.demoaccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


@SpringBootApplication
public class DemoAccessApplication implements CommandLineRunner {
    @Autowired
    private JdbcTemplate template;
    public static void main(String[] args) {
        SpringApplication.run(DemoAccessApplication.class, args);

    }
    @Override
    public void run(String... args) throws Exception {

        System.setProperty("hsqldb.method_class_names", "net.ucanaccess.converters.*");
        template.update("INSERT INTO ttt(NAME, COUNTER, DEPARTMENT) VALUES('Светлана', 35, 1)");
        List<TableA> tableList = template.query("SELECT ID, NAME, COUNTER, DEPARTMENT FROM ttt;",
                (rs, rowNum) -> new TableA(rs.getInt("ID"),
                        rs.getString("NAME"),
                        rs.getInt("COUNTER"),
                        rs.getInt("DEPARTMENT")));


        for (TableA table : tableList) {
            System.out.println("ID: " + table.getId() + ", Name: " + table.getName() + ", Counter: " + table.getCounter() + ", Department: " + table.getDepartment());
        }
        template.update("DELETE FROM ttt WHERE NAME = 'Светлана'");
    }
}
