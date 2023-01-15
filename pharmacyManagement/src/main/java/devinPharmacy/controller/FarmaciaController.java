package devinPharmacy.controller;

import devinPharmacy.dto.FarmaciaDto;
import devinPharmacy.entity.FarmaciaEntity;
import devinPharmacy.service.FarmaciaService;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/farmacia")
public class FarmaciaController {

    private FarmaciaService service;

    public FarmaciaController(FarmaciaService service){
        this.service = service;
    }

   // @PostMapping
  //  public FarmaciaEntity save(@RequestBody FarmaciaEntity farmacia) {

  //      return service.insert(farmacia);
 //   }

    @PostMapping

    public ResponseEntity save(@RequestBody FarmaciaEntity farmacia) {
        try {
            FarmaciaDto farmaciaDto = new FarmaciaDto();

            farmaciaDto.setDataP(farmacia);

            service.insert(farmacia);
            return new ResponseEntity<>(new FarmaciaDto(Response.SC_CREATED,"Nova farmácia cadastrada",farmaciaDto.getDataP()), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }


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
