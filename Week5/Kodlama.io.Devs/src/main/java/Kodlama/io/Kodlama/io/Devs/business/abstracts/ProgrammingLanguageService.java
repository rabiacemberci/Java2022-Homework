package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.CreatProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguage.GetAllProgrammingLanguageResponses;
import Kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguage.GetByIdProgrammingLanguageResponses;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(CreatProgrammingLanguageRequest creatProgrammingLanguageRequest);
    void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
    void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
    List<GetAllProgrammingLanguageResponses> getAll();
    GetByIdProgrammingLanguageResponses getById(int id);

}
