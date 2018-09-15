package com.portal.pesistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;
@Entity
@Table(name = "entity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name = "fistname")
    private  String fistName;
    @Column(name = "lastname")
    private  String lastName;
    @Column(name = "createddate")
    private Timestamp createdDate;
    @Column(name = "quitdate")
    private Timestamp quitDate;
    @Column(name = "login")
    private String login;

    public Set<RoleEntity> getRoleEntities() {
        return roleEntities;
    }

    public void setRoleEntities(Set<RoleEntity> roleEntities) {
        this.roleEntities = roleEntities;
    }

    @ManyToMany
    @JoinTable(name = "role_user",
            joinColumns = @JoinColumn(name = "roleid",referencedColumnName = "roleid"),
            inverseJoinColumns = @JoinColumn(name = "userid",referencedColumnName = "userid")
    )
    private  Set<RoleEntity> roleEntities;
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Timestamp quitDate) {
        this.quitDate = quitDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Column(name = "password")
    private String passWord;



   /* @OneToMany(mappedBy = "roleEntity",fetch = FetchType.EAGER)
    private Set<RoleEntity> roleEntities ;*/
}
