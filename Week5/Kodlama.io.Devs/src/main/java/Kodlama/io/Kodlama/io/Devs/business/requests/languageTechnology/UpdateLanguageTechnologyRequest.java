package Kodlama.io.Kodlama.io.Devs.business.requests.languageTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageTechnologyRequest {

    private int id;
    private String name;
    private int programmingLanguageId;
}
