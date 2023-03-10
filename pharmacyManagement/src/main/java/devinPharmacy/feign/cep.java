package devinPharmacy.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws/", name="cep")
public interface cep {

    @GetMapping("{cep}/json")
    EnderecoFeign findEndereco(@PathVariable("cep") String cep);
}
