package com.portal.pesistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "firsrname")
    private String firsrName;
    @Column(name = "lastnam")
    private  String lastName;
    @Column(name = "birthday")
    private String birthDay;
    @Column(name ="address")
    private String address;
    @Column(name ="email")
    private  String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "currentSalary")
    private  Integer currentSalary;
    @Column(name = "hireDate")
    private Timestamp hireDate;
    @Column(name = "quitDate")
    private Timestamp quitDate;
    @Column(name ="userid")
    private  Integer userId;
    @Column(name = "currentworkload")
    private String currentWorkLoad;
    @Column(name ="currentpointprojectnumber")
    private  Integer currentPointProjectNumber;
    @Column(name ="jointprojectnumber")
    private  Integer jointProjectNumber;

    @OneToOne
    @JoinColumn(name = "userid")
    private UserEntity userEntity;


    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public Set<AssignmentEntity> getAssignmentEntities() {
        return assignmentEntities;
    }

    public void setAssignmentEntities(Set<AssignmentEntity> assignmentEntities) {
        this.assignmentEntities = assignmentEntities;
    }

    @OneToMany(mappedBy = "employeeEntity")
    private Set<AssignmentEntity> assignmentEntities;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirsrName() {
        return firsrName;
    }

    public void setFirsrName(String firsrName) {
        this.firsrName = firsrName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Integer currentSalary) {
        this.currentSalary = currentSalary;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public Timestamp getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Timestamp quitDate) {
        this.quitDate = quitDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCurrentWorkLoad() {
        return currentWorkLoad;
    }

    public void setCurrentWorkLoad(String currentWorkLoad) {
        this.currentWorkLoad = currentWorkLoad;
    }

    public Integer getCurrentPointProjectNumber() {
        return currentPointProjectNumber;
    }

    public void setCurrentPointProjectNumber(Integer currentPointProjectNumber) {
        this.currentPointProjectNumber = currentPointProjectNumber;
    }

    public Integer getJointProjectNumber() {
        return jointProjectNumber;
    }

    public void setJointProjectNumber(Integer jointProjectNumber) {
        this.jointProjectNumber = jointProjectNumber;
    }
}
