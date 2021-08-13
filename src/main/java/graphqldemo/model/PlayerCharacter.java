package graphqldemo.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String characterName;
    @ManyToOne
    CharacterClass characterClass;
    @ManyToOne
    Player player;
}
