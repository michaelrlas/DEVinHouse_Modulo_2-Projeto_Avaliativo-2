package devinPharmacy.controller;

import devinPharmacy.dto.UsuarioDto;
import devinPharmacy.entity.UsuarioEntity;
import devinPharmacy.service.UsuarioService;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }


    @PostMapping

    public ResponseEntity save(@RequestBody UsuarioEntity usuario) {
        try {
            UsuarioDto usuarioDto = new UsuarioDto ();

            usuarioDto.setDataUser(usuario);

            service.insert(usuario);
            return new ResponseEntity<>(new UsuarioDto(Response.SC_CREATED,"Novo usuario cadastrado",usuarioDto.getDataUser()), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @GetMapping
    public List<UsuarioEntity> findAllUsuario(){
        return service.getAllUsuario();
}

    @GetMapping("/{id}")
    public UsuarioEntity findUsuarioPorId(@PathVariable("id") Long id) {
        return service.buscaUsuarioPorId(id);
  }

  @PutMapping
    public void updateUsuario(@RequestBody UsuarioEntity usuario) {
        service.insert(usuario);
  }

  @DeleteMapping("{id}")
  public void deleteUsuarioById(@PathVariable("id") Long id) {
    service.deleteUsuarioById(id);
  }

}
