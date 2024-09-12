package br.insper.banda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BandaController {

    @Autowired
    private BandaService bandaService;

    @PostMapping("/banda")
    @ResponseStatus(HttpStatus.CREATED)
    public String cadastrarBanda(@RequestBody Banda banda) {
        return bandaService.cadastrarBanda(banda);
    }

    @GetMapping("/banda")
    public ArrayList<Banda> listarBandas(@RequestParam(required = false) String pais) {
        return bandaService.listarBandas(pais);
    }


    @DeleteMapping("/banda/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void listarBandas(@PathVariable Integer id) {
        bandaService.excluirBanda(id);
    }


}
