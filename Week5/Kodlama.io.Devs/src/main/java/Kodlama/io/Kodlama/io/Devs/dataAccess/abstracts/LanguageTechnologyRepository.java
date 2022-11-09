package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.LanguageTechnology;


@Repository
public interface LanguageTechnologyRepository extends JpaRepository<LanguageTechnology,Integer> {

}



