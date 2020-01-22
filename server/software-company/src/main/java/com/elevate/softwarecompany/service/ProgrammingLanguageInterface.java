package com.elevate.softwarecompany.service;

import com.elevate.softwarecompany.model.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageInterface {

    List<ProgrammingLanguage> findAll();

    ProgrammingLanguage getOne(Integer id);

    void save(ProgrammingLanguage programmingLanguage);

    void delete(ProgrammingLanguage programmingLanguage);
}
