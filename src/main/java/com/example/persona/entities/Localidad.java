package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="localidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;

}
