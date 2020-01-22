package com.elevate.softwarecompany.service;

import com.elevate.softwarecompany.model.ProgrammingLanguage;
import com.elevate.softwarecompany.repository.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageService implements ProgrammingLanguageInterface{

    /**
     * Inject ProgrammingLanguageRepository dependency
     */
    @Autowired
    ProgrammingLanguageRepository programmingLanguageRepository;

    /**
     * Get all (find all) ProgrammingLanguages from repository
     * @return list of ProgrammingLanguage objects
     */
    @Override
    public List<ProgrammingLanguage> findAll() {
        return programmingLanguageRepository.findAll();
    }

    /**
     * Get one programmingLanguage from repository
     * @param id programmingLanguage object identifier
     * @return found programmingLanguage if exist, otherwise return null
     */
    @Override
    public ProgrammingLanguage getOne(Integer id) {
        return programmingLanguageRepository.findById(id).isPresent() ? programmingLanguageRepository.findById(id).get(): null;
    }

    /**
     * Save passed object into a repository
     * @param programmingLanguage is new programmingLanguage to save
     */
    @Override
    public void save(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.save(programmingLanguage);
    }

    /**
     * Delete passed object from a repository
     * @param programmingLanguage is programmingLanguage object ready to being deleted
     */
    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.delete(programmingLanguage);
    }
}
