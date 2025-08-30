package com.bero.basic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Role extends BaseEntity {
    @Id
    private long id;
    private String name;
    private String used;

    @OneToMany
    @JoinColumn(name = "role_id")
    private List<MemberRole> memberRole;
}
