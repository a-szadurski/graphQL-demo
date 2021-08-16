package graphqldemo.dto.character_class;

import lombok.Data;

@Data
public class UpdateCharacterClassInput {

    Long id;
    String characterClassName;
    String characterClassDescription;
}
