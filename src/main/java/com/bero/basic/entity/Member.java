package com.bero.basic.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "member")
public class Member extends BaseEntity {
    @Id
    private long id;
    private String loginId;
    private String password;
    private String name;
    private String phoneNumber;
    private String used;

    @OneToMany
    @JoinColumn(name = "member_id")
    private List<MemberRole> memberRole;
}
