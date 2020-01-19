package com.elevate.softwarecompany.model;

public abstract class Entity{

    private Integer id;

    protected Entity(){super();}

    protected Entity(Integer id) throws IllegalArgumentException {
        super();
        parameterValidation(id);
        this.id = id;
    }

    /**
     * Method which validate constructor parameters
     *
     * @param id Identifier of Entity
     * @throws IllegalArgumentException if one of parameter is incorrect
     */
    private void parameterValidation(Integer id) throws IllegalArgumentException{

        if(id == null)
            throw new IllegalArgumentException("Parameter id cannot be null!");
    }

    public Integer getId() { return id; }
}
