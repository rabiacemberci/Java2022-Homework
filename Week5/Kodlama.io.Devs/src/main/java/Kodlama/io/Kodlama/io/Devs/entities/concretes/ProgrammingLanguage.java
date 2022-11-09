package Kodlama.io.Kodlama.io.Devs.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name="programmingLanguage")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "programmingLanguage",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<LanguageTechnology> technologies;


}
