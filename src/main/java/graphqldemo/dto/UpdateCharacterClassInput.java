package graphqldemo.dto;

import lombok.Data;

@Data
public class UpdateCharacterClassInput {

    Long id;
    String characterClassName;
    String characterClassDescription;
}
