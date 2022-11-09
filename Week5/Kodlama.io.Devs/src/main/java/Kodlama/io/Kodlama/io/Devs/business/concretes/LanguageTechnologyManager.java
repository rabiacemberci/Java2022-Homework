package Kodlama.io.Kodlama.io.Devs.business.concretes;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageTechnologyService;
import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.CreatLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.DeleteLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.UpdateLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.languageTechnology.GetAllLanguageTechnologyResponses;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageTechnologyRepository;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.LanguageTechnology;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageTechnologyManager implements LanguageTechnologyService {
    private LanguageTechnologyRepository languageTechnologyRepository;
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public LanguageTechnologyManager(LanguageTechnologyRepository languageTechnologyRepository, ProgrammingLanguageRepository programmingLanguageRepository) {
        this.languageTechnologyRepository = languageTechnologyRepository;
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(CreatLanguageTechnologyRequest creatLanguageTechnologyRequest) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(creatLanguageTechnologyRequest.getProgrammingLanguageId()).get();
        LanguageTechnology languageTechnology = new LanguageTechnology();
        languageTechnology.setProgrammingLanguage(programmingLanguage);
        languageTechnology.setName(creatLanguageTechnologyRequest.getName());
        languageTechnologyRepository.save(languageTechnology);
    }

    @Override
    public void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(deleteLanguageTechnologyRequest.getId()).get();
        LanguageTechnology languageTechnology = new LanguageTechnology();
        languageTechnology.setProgrammingLanguage(programmingLanguage);
        languageTechnologyRepository.delete(languageTechnology);
    }

    @Override
    public void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(updateLanguageTechnologyRequest.getProgrammingLanguageId()).get();
        LanguageTechnology languageTechnology = languageTechnologyRepository.findById(updateLanguageTechnologyRequest.getId()).get();
        languageTechnology.setName(updateLanguageTechnologyRequest.getName());
        languageTechnology.setProgrammingLanguage(programmingLanguage);
        this.languageTechnologyRepository.save(languageTechnology);
    }

    @Override
    public List<GetAllLanguageTechnologyResponses> getAll() {
        List<LanguageTechnology> technologies = languageTechnologyRepository.findAll();
        List<GetAllLanguageTechnologyResponses> technologiesResponse = new ArrayList<GetAllLanguageTechnologyResponses>();
        for(LanguageTechnology languageTechnology: technologies) {
            GetAllLanguageTechnologyResponses responseItem = new GetAllLanguageTechnologyResponses();
            responseItem.setId(languageTechnology.getId());
            responseItem.setName(languageTechnology.getName());
            technologiesResponse.add(responseItem);
        }

        return technologiesResponse;
    }
}
