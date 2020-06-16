package com.itis.project2.models;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String email;
    @NotNull
    private String name;
    @NotNull
    private String password;

    @Transient
    private String passwordConfirm;

    @OneToMany(fetch=FetchType.EAGER)
    private Set<StatusSerial> statusSerials;

    @OneToMany(fetch=FetchType.EAGER)
    private Set<StatusEpisode> statusEpisodes;

    @Enumerated(value = EnumType.STRING)
    private Role role;
}
