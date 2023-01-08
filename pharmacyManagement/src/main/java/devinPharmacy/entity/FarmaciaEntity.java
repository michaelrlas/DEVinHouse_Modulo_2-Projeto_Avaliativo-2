package devinPharmacy.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "farmacia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FarmaciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String razao_social;

    @NotNull
    private String cnpj;

    @NotNull
    private String nome_fantasia;

    @NotNull
    private String email;

    private String telefone;

    private String celular;

}
