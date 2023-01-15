package devinPharmacy.service;

import devinPharmacy.entity.UsuarioEntity;
import devinPharmacy.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private UsuarioRepository repository;
    public UsuarioService(UsuarioRepository repository){
        this.repository = repository;

    }

    public void insert (UsuarioEntity usuario) {
        repository.save(usuario);
    }

    public List<UsuarioEntity> getAllUsuario(){
        return repository.findAll();
    }

    public UsuarioEntity buscaUsuarioPorId(Long id) {
        Optional<UsuarioEntity> byId = repository.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    public void deleteUsuarioById(Long id) {
        this.repository.deleteById(id);
    }

}
