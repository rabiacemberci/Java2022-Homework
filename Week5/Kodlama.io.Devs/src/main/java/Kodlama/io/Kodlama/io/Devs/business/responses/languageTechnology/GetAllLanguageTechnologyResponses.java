package Kodlama.io.Kodlama.io.Devs.business.responses.languageTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageTechnologyResponses {
    private int id;
    private String name;
    private GetByIdLanguageTechnologyResponses programmingLanguage;
}
