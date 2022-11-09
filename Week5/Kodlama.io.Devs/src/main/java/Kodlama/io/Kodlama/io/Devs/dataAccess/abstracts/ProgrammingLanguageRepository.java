package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> { //Veri tabanı işleri yapacak sınıflara verilen isimler

}
