package Kodlama.io.Kodlama.io.Devs.business.concretes;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.CreatProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguage.GetAllProgrammingLanguageResponses;
import Kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguage.GetByIdProgrammingLanguageResponses;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageTechnologyRepository;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;
    private LanguageTechnologyRepository languageTechnologyRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository, LanguageTechnologyRepository languageTechnologyRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
        this.languageTechnologyRepository = languageTechnologyRepository;
    }

    @Override
    public void add(CreatProgrammingLanguageRequest creatProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(creatProgrammingLanguageRequest.getName());
        this.programmingLanguageRepository.save(programmingLanguage);

    }

    @Override
    public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(deleteProgrammingLanguageRequest.getId()).get();
        programmingLanguageRepository.delete(programmingLanguage);

    }

    @Override
    public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(updateProgrammingLanguageRequest.getId()).get();
        programmingLanguage.setName(updateProgrammingLanguageRequest.getName());
        programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public List<GetAllProgrammingLanguageResponses> getAll() {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguageResponses> programmingLanguageResponses = new ArrayList<GetAllProgrammingLanguageResponses>();
        for (ProgrammingLanguage programmingLanguage: programmingLanguages) {
            GetAllProgrammingLanguageResponses responses = new GetAllProgrammingLanguageResponses();
            responses.setName(programmingLanguage.getName());
            programmingLanguageResponses.add(responses);

        }
        return programmingLanguageResponses;
    }

    @Override
    public GetByIdProgrammingLanguageResponses getById(int id) {
        Optional<ProgrammingLanguage> programmingLanguage = programmingLanguageRepository.findById(id);
        GetByIdProgrammingLanguageResponses responses = new GetByIdProgrammingLanguageResponses();
        responses.setName(programmingLanguage.get().getName());
        return responses;
    }
}
