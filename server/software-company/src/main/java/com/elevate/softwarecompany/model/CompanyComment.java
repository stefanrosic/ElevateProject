package com.elevate.softwarecompany.model;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class CompanyComment extends AbstractEntity {

    @Column(nullable = false)
    private String sender;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String type;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private SoftwareCompany softwareCompany;

    public CompanyComment(){}

    public CompanyComment(String sender, String content, String type, SoftwareCompany softwareCompany) {
        super();
        parameterValidation(sender, content, type, softwareCompany);
        this.sender = sender;
        this.content = content;
        this.type = type;
        this.softwareCompany = softwareCompany;
    }

    public CompanyComment(Integer id, String sender, String content, String type, SoftwareCompany softwareCompany) throws IllegalArgumentException {
        super(id);
        parameterValidation(sender, content, type, softwareCompany);
        this.sender = sender;
        this.content = content;
        this.type = type;
        this.softwareCompany = softwareCompany;
    }


    /**
     * Constructor parameters method validation
     *
     * @param sender Validate sender parameter
     * @param content Validate content parameter
     * @throws IllegalArgumentException if one of these parameters is incorrect
     */
    public void parameterValidation(String sender, String content, String type, SoftwareCompany softwareCompany) throws IllegalArgumentException {

        if(sender == null)
            throw new IllegalArgumentException("Parameter sender cannot be null!");

        if(content == null)
            throw new IllegalArgumentException("Parameter content cannot be null!");

        if(softwareCompany == null)
            throw new IllegalArgumentException("Parameter softwareCompany cannot be null!");

        if(type == null)
            throw new IllegalArgumentException("Parameter type cannot be null!");
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public SoftwareCompany getSoftwareCompany() {
        return softwareCompany;
    }

    public String getType() {
        return type;
    }
}
