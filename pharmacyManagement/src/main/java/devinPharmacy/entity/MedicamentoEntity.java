package devinPharmacy.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "medicamento")
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
