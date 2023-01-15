package devinPharmacy.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;



@Entity
@Table(name = "farmacia")
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


    @OneToOne(fetch = FetchType.EAGER, cascade =CascadeType.ALL)
    @JoinColumn (name="endereco_id", referencedColumnName = "id")
    private EnderecoEntity enderecoEntity;


}
