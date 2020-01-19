package com.elevate.softwarecompany.model;

import com.elevate.softwarecompany.util.RegularExpressions;

public class ProgrammingLanguage extends Entity{

    private String programmingLanguageName;

    public ProgrammingLanguage(String programmingLanguageName) throws IllegalArgumentException{
        super();
        parameterValidation(programmingLanguageName);
        this.programmingLanguageName = programmingLanguageName;
    }

    public ProgrammingLanguage(Integer id, String programmingLanguageName) throws IllegalArgumentException {
        super(id);
        parameterValidation(programmingLanguageName);
        this.programmingLanguageName = programmingLanguageName;
    }

    /**
     * Method which validate constructor parameters
     *
     * @param programmingLanguageName represents Programming language name for which is validation implemented
     * @throws IllegalArgumentException if parameter is incorrect
     */
    public void parameterValidation(String programmingLanguageName) throws IllegalArgumentException {

        if(programmingLanguageName == null)
            throw new IllegalArgumentException("Parameter programmingLanguageName cannot be null!");
        else if (!programmingLanguageName.matches(RegularExpressions.name))
            throw new IllegalArgumentException("Parameter programmingLanguageName can only contains a characters!");
    }

    public String getProgrammingLanguageName() {
        return programmingLanguageName;
    }

}
