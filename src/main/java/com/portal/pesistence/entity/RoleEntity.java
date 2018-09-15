package com.portal.pesistence.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    @Column(name = "rolename")
    private String roleName;



    @ManyToMany(mappedBy = "role_user")
    @JoinTable(name = "role_user",
            joinColumns = @JoinColumn(name = "userid",referencedColumnName = "userid"),
            inverseJoinColumns = @JoinColumn(name = "roleid",referencedColumnName = "roleid")

    )
    private Set<UserEntity> userEntities;
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public Set<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(Set<UserEntity> userEntities) {
        this.userEntities = userEntities;
    }

}
