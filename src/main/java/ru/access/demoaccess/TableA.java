package ru.access.demoaccess;

public class TableA {
    protected String id;
    protected String DataPlanPay;
    protected String ID_Project;
    protected String Data_plan;
    protected String OPEX;
    protected String NDSOPEX;
    protected String  CAPEX;
    protected String NDSCAPEX;
    protected String Comment;
    protected String stepProject;
    protected String duration;
    protected String interval;
   protected String Completed;

    public TableA(String id, String dataPlanPay, String ID_Project, String data_plan, String OPEX, String NDSOPEX, String CAPEX, String NDSCAPEX, String comment, String stepProject, String duration, String interval, String Completed) {
        this.id = id;
        DataPlanPay = dataPlanPay;
        this.ID_Project = ID_Project;
        Data_plan = data_plan;
        this.OPEX = OPEX;
        this.NDSOPEX = NDSOPEX;
        this.CAPEX = CAPEX;
        this.NDSCAPEX = NDSCAPEX;
        this.Comment = comment;
        this.stepProject = stepProject;
        this.duration = duration;
        this.interval = interval;
        this.Completed = Completed;
    }

    @Override
    public String toString() {
        return "TableA{" +
                "id='" + id + '\'' +
                ", DataPlanPay='" + DataPlanPay + '\'' +
                ", ID_Project='" + ID_Project + '\'' +
                ", Data_plan='" + Data_plan + '\'' +
                ", OPEX='" + OPEX + '\'' +
                ", NDSOPEX='" + NDSOPEX + '\'' +
                ", CAPEX='" + CAPEX + '\'' +
                ", NDSCAPEX='" + NDSCAPEX + '\'' +
                ", Comment='" + Comment + '\'' +
                ", stepProject='" + stepProject + '\'' +
                ", duration='" + duration + '\'' +
                ", interval='" + interval + '\'' +
                ", Completed='" + Completed + '\'' +
                '}';
    }

    public String getNDSOPEX() {
        return NDSOPEX;
    }

    public void setNDSOPEX(String NDSOPEX) {
        this.NDSOPEX = NDSOPEX;
    }

    public String getCAPEX() {
        return CAPEX;
    }

    public void setCAPEX(String CAPEX) {
        this.CAPEX = CAPEX;
    }

    public String getNDSCAPEX() {
        return NDSCAPEX;
    }

    public void setNDSCAPEX(String NDSCAPEX) {
        this.NDSCAPEX = NDSCAPEX;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getStepProject() {
        return stepProject;
    }

    public void setStepProject(String stepProject) {
        this.stepProject = stepProject;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getCompleted() {
        return Completed;
    }

    public void setCompleted(String completed) {
        Completed = completed;
    }

    public String getId() {
        return id;
    }

    public String getDataPlanPay() {
        return DataPlanPay;
    }

    public void setDataPlanPay(String dataPlanPay) {
        DataPlanPay = dataPlanPay;
    }

    public String getID_Project() {
        return ID_Project;
    }

    public void setID_Project(String ID_Project) {
        this.ID_Project = ID_Project;
    }

    public String getData_plan() {
        return Data_plan;
    }

    public void setData_plan(String data_plan) {
        Data_plan = data_plan;
    }

    public String getOPEX() {
        return OPEX;
    }

    public void setOPEX(String OPEX) {
        this.OPEX = OPEX;
    }

}
