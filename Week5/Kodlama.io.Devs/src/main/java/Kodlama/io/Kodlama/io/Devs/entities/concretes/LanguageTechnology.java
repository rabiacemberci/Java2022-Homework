package Kodlama.io.Kodlama.io.Devs.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="languageTechnology")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LanguageTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="programming_language_id")
    @JsonIgnore
    private ProgrammingLanguage programmingLanguage;




}


