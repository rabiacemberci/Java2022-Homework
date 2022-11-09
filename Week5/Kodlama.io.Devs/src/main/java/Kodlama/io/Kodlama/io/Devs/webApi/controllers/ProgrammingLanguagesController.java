package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.CreatProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.DeleteProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguage.GetAllProgrammingLanguageResponses;
import Kodlama.io.Kodlama.io.Devs.business.responses.programmingLanguage.GetByIdProgrammingLanguageResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguageResponses> getAll(){
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(CreatProgrammingLanguageRequest creatProgrammingLanguageRequest){
        programmingLanguageService.add(creatProgrammingLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest){
        programmingLanguageService.delete(deleteProgrammingLanguageRequest);
    }
    @PutMapping("/update")
    public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest){
        programmingLanguageService.update(updateProgrammingLanguageRequest);
    }

    @GetMapping("/getbyid")
    public GetByIdProgrammingLanguageResponses getById(int id){
        return programmingLanguageService.getById(id);
    }
}
