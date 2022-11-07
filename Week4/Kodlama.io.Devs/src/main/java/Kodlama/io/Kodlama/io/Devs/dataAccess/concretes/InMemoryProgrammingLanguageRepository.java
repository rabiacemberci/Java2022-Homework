package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository(){
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
        programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
        programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
        programmingLanguages.add(new ProgrammingLanguage(4,"JavaScript"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguages.add(programmingLanguage);
    }


    @Override
    public ProgrammingLanguage getById(int id) {
        for(ProgrammingLanguage programmingLanguage:programmingLanguages) {
            if(programmingLanguage.getId()==id) {
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        for(ProgrammingLanguage programmingLanguage:programmingLanguages) {
            if(programmingLanguage.getId()==id) {
                programmingLanguages.remove(id);
            }
        }
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for(ProgrammingLanguage language:programmingLanguages) {
            if(language.getId()==programmingLanguage.getId()) {
                language.setId(programmingLanguage.getId());
                language.setName(programmingLanguage.getName());
            }
        }
    }
}
