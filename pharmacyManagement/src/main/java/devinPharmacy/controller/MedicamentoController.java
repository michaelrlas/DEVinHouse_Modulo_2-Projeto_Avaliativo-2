package devinPharmacy.controller;

import devinPharmacy.entity.MedicamentoEntity;
import devinPharmacy.service.MedicamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {

    private MedicamentoService service;

    public MedicamentoController(MedicamentoService service){
        this.service = service;
    }

    @PostMapping
    public void save(@RequestBody MedicamentoEntity medicamento) {
        service.insert(medicamento);
    }

    @GetMapping
    public List<MedicamentoEntity> findAllMedicamento(){
        return service.getAllMedicamento();
}

    @GetMapping("/{id}")
    public MedicamentoEntity findMedicamentoPorId(@PathVariable("id") Long id) {
        return service.buscaMedicamentoPorId(id);
  }

  @PutMapping
    public void updateMedicamento(@RequestBody MedicamentoEntity medicamento) {
        service.insert(medicamento);
  }

  @DeleteMapping("{id}")
  public void deleteMedicamentoById(@PathVariable("id") Long id) {
    service.deleteMedicamentoById(id);
  }

}
