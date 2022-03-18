package com.wasiph.springdb.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="profiles")
@Data
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    private String name;

    @Temporal(TemporalType.TIME)
    private java.util.Date utilTime;

    @Temporal(TemporalType.DATE)
    private java.util.Date utilDate;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date utilTimestamp;

}
