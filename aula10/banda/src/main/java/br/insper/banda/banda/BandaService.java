package br.insper.banda.banda;

import br.insper.banda.musica.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@Service
public class BandaService {

    @Autowired
    private BandaRepository bandaRepository;

    @Autowired
    private MongoTemplate mongoTemplate;


    public RetornarBandaDTO cadastrarBanda(CadastrarBandaDTO dto) {

        Banda bandaDB = bandaRepository.findByNome(dto.nome());

        if (bandaDB == null) {
            Banda banda = new Banda();
            banda.setNome(dto.nome());
            banda.setPais(dto.pais());
            banda.setAnoFormacao(dto.anoFormacao());

            banda = bandaRepository.save(banda);
            return new RetornarBandaDTO(banda.getId(), banda.getNome(), banda.getPais());
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    public Page<Banda> listarBandas(String pais, Pageable pageable) {
        if (pais != null) {
            return bandaRepository.findByPais(pais, pageable);
        }


        mongoTemplate.query().
        return bandaRepository.findAll(pageable);
    }

    public Banda buscarBanda(String id) {
        return bandaRepository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }

    /**
     * Função que exclui a banda
     * @param id:
     */
    public void excluirBanda(String id) {
        Banda banda = buscarBanda(id);
        bandaRepository.delete(banda);
    }

    public RetornarBandaDTO editarBanda(String id, EditarBandaDTO editarBandaDTO) {
        Banda banda = buscarBanda(id);
        if (editarBandaDTO.nome() != null) {
            banda.setNome(editarBandaDTO.nome());
        }
        if (editarBandaDTO.pais() != null) {
            banda.setPais(editarBandaDTO.pais());
        }

        banda = bandaRepository.save(banda);
        return new RetornarBandaDTO(banda.getId(), banda.getNome(), banda.getPais());
    }
}
