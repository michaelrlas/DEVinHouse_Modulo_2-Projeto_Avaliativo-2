package devinPharmacy.dto;

import devinPharmacy.entity.MedicamentoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicamentoDto {
    private int status_code;
    private String message;
    private MedicamentoEntity data;
}
