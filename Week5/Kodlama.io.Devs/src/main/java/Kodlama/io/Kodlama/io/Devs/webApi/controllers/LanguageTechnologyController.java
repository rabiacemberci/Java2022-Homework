package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageTechnologyService;
import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.CreatLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.DeleteLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology.UpdateLanguageTechnologyRequest;
import Kodlama.io.Kodlama.io.Devs.business.responses.languageTechnology.GetAllLanguageTechnologyResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languagetechnology")
public class LanguageTechnologyController {
    private LanguageTechnologyService languageTechnologyService;

    @Autowired
    public LanguageTechnologyController(LanguageTechnologyService languageTechnologyService) {
        this.languageTechnologyService = languageTechnologyService;
    }

    @GetMapping("/getall")
    public List<GetAllLanguageTechnologyResponses> getAll(){
        return languageTechnologyService.getAll();
    }
    @PostMapping("/add")
    public void add(CreatLanguageTechnologyRequest creatLanguageTechnologyRequest){
        languageTechnologyService.add(creatLanguageTechnologyRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteLanguageTechnologyRequest deleteLanguageTechnologyRequest){
        languageTechnologyService.delete(deleteLanguageTechnologyRequest);
    }
    @PutMapping("/update")
    public void update(UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest){
        languageTechnologyService.update(updateLanguageTechnologyRequest);
    }
}
