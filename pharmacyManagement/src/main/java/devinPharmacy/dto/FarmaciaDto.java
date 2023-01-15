package devinPharmacy.dto;

import devinPharmacy.entity.FarmaciaEntity;
import devinPharmacy.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FarmaciaDto {
    private int status_code;
    private String message;
    private FarmaciaEntity dataP;


}
