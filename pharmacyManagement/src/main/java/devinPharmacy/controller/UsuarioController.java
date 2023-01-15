package devinPharmacy.controller;

import devinPharmacy.entity.UsuarioEntity;
import devinPharmacy.service.UsuarioService;
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
    public void save(@RequestBody UsuarioEntity usuario) {
        service.insert(usuario);
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
