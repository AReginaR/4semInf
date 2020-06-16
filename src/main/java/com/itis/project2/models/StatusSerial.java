package com.itis.project2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "list_serial_status")
@IdClass(StatusSerialKey.class)
public class StatusSerial {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "serial_id", referencedColumnName = "id")
    private Serial serial;

    @Column(name = "status_serial")
    private String statusSerial;

    @Min(value=1, message="Invalid Rating")
    @Max(value=5, message="Invalid Rating")
    private int rating;

}
