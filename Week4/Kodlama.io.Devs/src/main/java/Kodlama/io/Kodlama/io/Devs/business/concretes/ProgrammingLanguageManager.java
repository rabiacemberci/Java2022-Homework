package Kodlama.io.Kodlama.io.Devs.business.concretes;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception{
        if (programmingLanguage.getName().isEmpty()) {
            throw new Exception("Names cannot be null.");

        } else if(isValid(programmingLanguage.getName())) {
            throw new Exception("Programming language registered.");

        } else {programmingLanguageRepository.add(programmingLanguage);}

    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(id);

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.update(programmingLanguage);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return this.programmingLanguageRepository.getById(id);
    }

    private boolean isValid(String name) {
        for(ProgrammingLanguage language:programmingLanguageRepository.getAll()) {
            if(language.getName().equals(name)) {
                return true;
            }

        }
        return false;
    }

}
