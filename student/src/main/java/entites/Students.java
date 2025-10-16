package entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name" , nullable = false)
    private String lastName;

    @Column(name = "birth_of_date" , nullable = true)
    private String birthOfDate;

    @Column(name = "birth_of_date" , nullable = true)
    private String birthOfDate;
//    sjuswhejibeugueyuihsjiuhaiyjuioksnhjskksaij k
//    sdsadasdasdsad
}
