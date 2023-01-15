package devinPharmacy.service;

import devinPharmacy.entity.MedicamentoEntity;
import devinPharmacy.repository.MedicamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService {

    private MedicamentoRepository repository;

    public MedicamentoService(MedicamentoRepository repository){
        this.repository = repository;

    }

    public void insert (MedicamentoEntity medicamento) {
        repository.save(medicamento);
    }

    public List<MedicamentoEntity> getAllMedicamento(){
        return repository.findAll();
    }

    public MedicamentoEntity buscaMedicamentoPorId(Long id) {
        Optional<MedicamentoEntity> byId = repository.findById(id);
        if (byId.isPresent()){
            return byId.get();
        }
        return null;
    }

    public void deleteMedicamentoById(Long id) {
        this.repository.deleteById(id);
    }

}
