package com.elevate.softwarecompany.model;

import com.elevate.softwarecompany.util.RegularExpressions;

public class Framework extends ProgrammingLanguage{

    private String frameworkName;

    public Framework(String programmingLanguageName, String frameworkName) throws IllegalArgumentException {
        super(programmingLanguageName);
        this.frameworkName = frameworkName;
    }

    public Framework(Integer id, String programmingLanguageName, String frameworkName) throws IllegalArgumentException {
        super(id, programmingLanguageName);
        this.frameworkName = frameworkName;
    }

    /**
     * Method which validate constructor parameters
     *
     * @param frameworkName Programming language framework name
     * @throws IllegalArgumentException if @param frameworkName is incorrect
     */
    public void parameterValidation(String frameworkName) throws IllegalArgumentException {

        if(frameworkName == null)
            throw new IllegalArgumentException("Parameter frameworkName cannot be null!");
        else if (!frameworkName.matches(RegularExpressions.name))
            throw new IllegalArgumentException("Parameter frameworkName can only contains a characters!");
    }

    public String getFrameworkName() {
        return frameworkName;
    }
}
