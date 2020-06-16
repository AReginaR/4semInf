package com.itis.project2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer season;
    private Integer numEpisode;
    private String name;
    private Date realise_date;

    @ManyToOne()
    @JoinColumn(name = "serial_id", referencedColumnName = "id")
    private Serial serial;

    @OneToMany(mappedBy = "episode", fetch = FetchType.EAGER)
    private Set<StatusEpisode> statusEpisodes;


}