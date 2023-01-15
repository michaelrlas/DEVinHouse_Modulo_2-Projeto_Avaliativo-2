package devinPharmacy.controller;

import devinPharmacy.dto.MedicamentoDto;
import devinPharmacy.entity.MedicamentoEntity;
import devinPharmacy.service.MedicamentoService;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static jakarta.servlet.http.HttpServletResponse.SC_CREATED;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {

    private MedicamentoService service;

    public MedicamentoController(MedicamentoService service){
        this.service = service;
    }

    @PostMapping

    public ResponseEntity save(@RequestBody MedicamentoEntity medicamento) {
        try {
            MedicamentoDto medicamentoDto = new MedicamentoDto();

            medicamentoDto.setData(medicamento);

            service.insert(medicamento);
            return new ResponseEntity<>(new MedicamentoDto(Response.SC_CREATED,"Novo medicamento cadastrado",medicamentoDto.getData()), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }


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
