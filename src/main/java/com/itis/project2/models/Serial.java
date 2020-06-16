package com.itis.project2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Serial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String descrition;
    private LocalDateTime realiseDate;
    private LocalDateTime expirationDate;
    private String genre;
    private Integer numberOfSeason;
    private Double rating;

//    @ManyToMany(mappedBy = "genre", fetch = FetchType.EAGER)
//    private Set<Genre> genre;

    @OneToMany(mappedBy = "serial", fetch = FetchType.EAGER)
    private Set<StatusSerial> statusSerials;

    @OneToMany(mappedBy = "serial", fetch = FetchType.EAGER)
    private Set<Episode> episodes;

}
