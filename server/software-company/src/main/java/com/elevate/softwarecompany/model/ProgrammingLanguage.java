package com.elevate.softwarecompany.model;

import com.elevate.softwarecompany.util.RegularExpressions;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "programming_languages")
public class ProgrammingLanguage extends AbstractEntity{

    @Column(name = "programming_language_name", nullable = false)
    private String programmingLanguageName;

    @ElementCollection
    @Column(name = "framework_name", nullable = false)
    private List<String> frameworks;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private SoftwareCompany softwareCompany;

    public ProgrammingLanguage(){}

    public ProgrammingLanguage(String programmingLanguageName, List<String> frameworks) {
        super();
        parameterValidation(programmingLanguageName, frameworks);
        this.programmingLanguageName = programmingLanguageName;
        this.frameworks = frameworks;
    }

    public ProgrammingLanguage(Integer id, String programmingLanguageName, List<String> frameworks) throws IllegalArgumentException {
        super(id);
        parameterValidation(programmingLanguageName, frameworks);
        this.programmingLanguageName = programmingLanguageName;
        this.frameworks = frameworks;
    }

    /**
     * Constructor parameters method validation
     *
     * @param programmingLanguageName represents Programming language name for which is validation implemented
     * @param frameworks represents frameworks of Programming language for which is validation implemented
     * @throws IllegalArgumentException if parameter is incorrect
     */
    public void parameterValidation(String programmingLanguageName, List<String> frameworks) throws IllegalArgumentException {

        if(programmingLanguageName == null)
            throw new IllegalArgumentException("Parameter programmingLanguageName cannot be null!");
        else if (!programmingLanguageName.matches(RegularExpressions.name))
            throw new IllegalArgumentException("Parameter programmingLanguageName can only contains a characters!");

        if(frameworks == null)
            throw new IllegalArgumentException("Parameter frameworks cannot be null!");
    }

    public String getProgrammingLanguageName() {
        return programmingLanguageName;
    }

    public List<String> getFrameworks() {
        return frameworks;
    }
}
