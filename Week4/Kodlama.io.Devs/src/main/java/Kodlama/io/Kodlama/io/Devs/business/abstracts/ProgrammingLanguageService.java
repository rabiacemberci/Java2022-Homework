package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(int id);
    void update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);

}
