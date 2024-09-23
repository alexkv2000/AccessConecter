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
    //    template.update("INSERT INTO ttt(NAME, COUNTER, DEPARTMENT) VALUES('Алёна', 24, 2)");
        List<TableA> tableList = template.query("SELECT id, DataPlanPay, ID_Project, Data_plan, OPEX, NDSOPEX, CAPEX, NDSCAPEX, Comment, stepProject, duration, interval, Completed FROM planPayProject",
                (rs, rowNum) -> new TableA(rs.getString("id"),
                        rs.getString("DataPlanPay"),
                        rs.getString("ID_Project"),
                        rs.getString("Data_plan"),
                        rs.getString("OPEX"),
                        rs.getString("NDSOPEX"),
                        rs.getString("CAPEX"),
                        rs.getString("NDSCAPEX"),
                        rs.getString("Comment"),
                        rs.getString("stepProject"),
                        rs.getString("duration"),
                        rs.getString("interval"),
                        rs.getString("Completed")
                        ));


        for (TableA table : tableList) {
            System.out.println("ID: " + table.getId() +
                    ", DataPlanPay: " + table.getDataPlanPay() +
                    ", ID_Project: " + table.getID_Project() +
                    ", Data_plan : " + table.getData_plan() +
                    ", OPEX : " + table.getOPEX() +
                    ", OPEX : " + table.getNDSOPEX() +
                    ", OPEX : " + table.getCAPEX() +
                    ", OPEX : " + table.getNDSCAPEX() +
                    ", OPEX : " + table.getComment() +
                    ", OPEX : " + table.getStepProject() +
                    ", OPEX : " + table.getDuration() +
                    ", OPEX : " + table.getInterval() +
                    ", OPEX : " + table.getCompleted() );
        }
        //template.update("DELETE FROM ttt WHERE NAME = 'Алёна'");
        //System.out.println(tableList.toString());
    }
}
