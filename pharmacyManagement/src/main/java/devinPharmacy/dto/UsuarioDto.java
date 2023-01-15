package devinPharmacy.dto;

import devinPharmacy.entity.UsuarioEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private int status_code;
    private String message;
    private UsuarioEntity dataUser;
}
