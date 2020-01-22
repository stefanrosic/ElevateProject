package com.elevate.softwarecompany.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id", columnDefinition = "BIGINT", unique = true, nullable = false)
    private Integer id;

    protected AbstractEntity(){super();}

    protected AbstractEntity(Integer id) throws IllegalArgumentException {
        super();
        parameterValidation(id);
        this.id = id;
    }

    /**
     * Method which validate constructor parameters
     *
     * @param id Identifier of AbstractEntity
     * @throws IllegalArgumentException if one of parameter is incorrect
     */
    private void parameterValidation(Integer id) throws IllegalArgumentException{

        if(id == null)
            throw new IllegalArgumentException("Parameter id cannot be null!");
    }

    public Integer getId() { return id; }
}
