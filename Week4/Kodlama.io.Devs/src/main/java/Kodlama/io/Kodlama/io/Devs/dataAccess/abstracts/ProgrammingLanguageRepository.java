package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository { //Veri tabanı işleri yapacak sınıflara verilen isimler
    List<ProgrammingLanguage> getAll();
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    void update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);
}
