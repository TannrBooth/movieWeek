package com.javaunit3.springmvc;

import javax.persistence.*;

@Entity
@Table(name="votes")
public class VoteEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="voter_name")
    private String voterName;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }
}
