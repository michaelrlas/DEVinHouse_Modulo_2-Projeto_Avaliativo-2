package devinPharmacy.service;

import devinPharmacy.entity.FarmaciaEntity;
import devinPharmacy.repository.FarmaciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmaciaService {

    private FarmaciaRepository repository;

    public FarmaciaService(FarmaciaRepository repository){
        this.repository = repository;

    }

    public void insert (FarmaciaEntity farmacia) {
        repository.save(farmacia);
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
