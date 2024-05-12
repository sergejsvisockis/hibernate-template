package io.github.sergejsvisockis.template.hibernate.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;

import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -6729067763876844892L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "base_seq_gen")
    @SequenceGenerator(name = "base_seq_gen", sequenceName = "base_id_seq", allocationSize = 1)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
