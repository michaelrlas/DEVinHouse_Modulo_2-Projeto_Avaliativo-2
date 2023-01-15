package devinPharmacy.service;

import devinPharmacy.entity.EnderecoEntity;
import devinPharmacy.entity.FarmaciaEntity;
import devinPharmacy.feign.EnderecoFeign;
import devinPharmacy.feign.cep;
import devinPharmacy.repository.EnderecoRepository;
import devinPharmacy.repository.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FarmaciaService {

    private FarmaciaRepository repository;
    public FarmaciaService(FarmaciaRepository repository){
        this.repository = repository;

    }
@Autowired
private cep cep;
    @Autowired
    private EnderecoRepository enderecoRepository;
    public FarmaciaEntity insert (FarmaciaEntity farmacia) {
        EnderecoEntity enderecoEntity = new EnderecoEntity();
        EnderecoFeign enderecoFeign = cep.findEndereco (farmacia.getEnderecoEntity().getCep());

        //Pegando info gerada automaticamente viacep
        enderecoEntity.setCep(farmacia.getEnderecoEntity().getCep());
        enderecoEntity.setLogradouro(enderecoFeign.getLogradouro());
        enderecoEntity.setNumero(farmacia.getEnderecoEntity().getNumero());
        enderecoEntity.setBairro(enderecoFeign.getBairro());
        enderecoEntity.setCidade(enderecoFeign.getLocalidade());
        enderecoEntity.setEstado(enderecoFeign.getUf());
        enderecoEntity.setComplemento(farmacia.getEnderecoEntity().getComplemento());
        enderecoEntity.setLatitude(farmacia.getEnderecoEntity().getLatitude());
        enderecoEntity.setLongitude(farmacia.getEnderecoEntity().getLongitude());


        farmacia.setEnderecoEntity(enderecoEntity);
        repository.save(farmacia);
        enderecoRepository.save(enderecoEntity);
        return farmacia;
    }

    public List<FarmaciaEntity> getAllFarmacia(){
        return repository.findAll();
    }

    public FarmaciaEntity buscaFarmaciaPorId(Long id) {
        Optional<FarmaciaEntity> byId = repository.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    public void deleteFarmaciaById(Long id) {
        this.repository.deleteById(id);
    }



}
