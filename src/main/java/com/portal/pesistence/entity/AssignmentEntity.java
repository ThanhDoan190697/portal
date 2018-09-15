package com.portal.pesistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "assignment")
public class AssignmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer assignmentId;
    @Column(name = "formadate")
    private Timestamp formaDate;
    @Column(name = "enddate")
    private Timestamp endDate;
    @Column(name = "workload")
    private  Integer workLoad;
    @Column(name = " assignmentcost")
    private Integer assignmentCost;


    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

    @ManyToOne
    @JoinColumn(name = "employeeid")
    private EmployeeEntity employeeEntity;

    @ManyToOne
    @JoinColumn(name = "projectid")
    private ProjectEntity projectEntity;
    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Timestamp getFormaDate() {
        return formaDate;
    }

    public void setFormaDate(Timestamp formaDate) {
        this.formaDate = formaDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Integer getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(Integer workLoad) {
        this.workLoad = workLoad;
    }

    public Integer getAssignmentCost() {
        return assignmentCost;
    }

    public void setAssignmentCost(Integer assignmentCost) {
        this.assignmentCost = assignmentCost;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Column(name = "rate")
    private  Integer rate;
}
