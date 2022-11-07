package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguagesController {
    ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("getall")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }

    @PostMapping("add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("delete")
    public void delete(int id) {
        programmingLanguageService.delete(id);
    }

    @PutMapping("update")
    public void update(ProgrammingLanguage programmingLanguage)
    {
        programmingLanguageService.update(programmingLanguage);
    }
}
