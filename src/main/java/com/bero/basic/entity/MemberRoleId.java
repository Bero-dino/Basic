package com.bero.basic.entity;

import jakarta.persistence.Column;

import java.io.Serializable;

public class MemberRoleId implements Serializable {
    @Column(name = "member_id")
    private long memberId;

    @Column(name = "role_id")
    private long roleId;

    public MemberRoleId(Long memberId, Long roleId) {
        this.memberId = memberId;
        this.roleId = roleId;
    }
}
