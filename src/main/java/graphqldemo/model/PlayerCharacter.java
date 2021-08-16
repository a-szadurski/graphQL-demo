package graphqldemo.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String characterName;
    @ManyToOne(fetch = FetchType.EAGER)
    CharacterClass characterClass;
    @ManyToOne(fetch = FetchType.EAGER)
    Player player;
}
