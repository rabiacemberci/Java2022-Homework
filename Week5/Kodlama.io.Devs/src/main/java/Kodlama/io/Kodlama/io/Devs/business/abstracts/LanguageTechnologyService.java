package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.CreatLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.DeleteLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.UpdateLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.languageTechnology.GetAllLanguageTechnologyResponses;

import java.util.List;

public interface LanguageTechnologyService {
    void add(CreatLanguageTechnologyRequest creatLanguageTechnologyRequest);
    void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest);
    void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest);
    List<GetAllLanguageTechnologyResponses> getAll();
}
