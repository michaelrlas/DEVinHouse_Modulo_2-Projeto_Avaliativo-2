package devinPharmacy.controller;

import devinPharmacy.entity.FarmaciaEntity;
import devinPharmacy.service.FarmaciaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmacia")
public class FarmaciaController {

    private FarmaciaService service;

    public FarmaciaController(FarmaciaService service){
        this.service = service;
    }

    @PostMapping
    public FarmaciaEntity save(@RequestBody FarmaciaEntity farmacia) {

        return service.insert(farmacia);
    }

    @GetMapping
    public List<FarmaciaEntity> findAllEmpresas(){
        return service.getAllFarmacia();
}

    @GetMapping("/{id}")
    public FarmaciaEntity findFarmacaiaPorId(@PathVariable("id") Long id) {
        return service.buscaFarmaciaPorId(id);
  }

  @PutMapping
    public void updateFarmacia(@RequestBody FarmaciaEntity farmacia) {
        service.insert(farmacia);
  }

  @DeleteMapping("{id}")
  public void deleteFarmaciaById(@PathVariable("id") Long id) {
    service.deleteFarmaciaById(id);
  }

}
