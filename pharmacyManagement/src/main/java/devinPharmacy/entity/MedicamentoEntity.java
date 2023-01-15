package devinPharmacy.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;



@Entity(name = "medicamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome_medicamento;

    @NotNull
    private String nome_laboratorio;

    @NotNull
    private String dosagem_medicamento;

    @NotNull
    private String descricao_medicamento;

    @NotNull
    private String preco_unitario;

    @NotNull
    private String tipo_medicamento;
}
