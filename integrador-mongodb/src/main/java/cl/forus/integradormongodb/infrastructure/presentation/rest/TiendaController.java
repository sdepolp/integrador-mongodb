package cl.forus.integradormongodb.infrastructure.presentation.rest;

import cl.forus.integradormongodb.core.uses.find.FindAll;
import cl.forus.integradormongodb.core.uses.find.FindByCadena;
import cl.forus.integradormongodb.core.uses.find.FindByLocalId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/tiendas")
@Slf4j
@Profile("rest")
public class TiendaController {

    private final FindByLocalId findByLocalId;
    private final FindAll findAll;
    private final FindByCadena findByCadena;

    public TiendaController(FindByLocalId findByLocalId, FindAll findAll, FindByCadena findByCadena) {
        this.findByLocalId = findByLocalId;
        this.findAll = findAll;
        this.findByCadena = findByCadena;
    }

    @GetMapping
    public List<TiendaRestDto> getAllTiendas() { return findAll.get().stream().map(TiendaRestDto::from).collect(Collectors.toList()); }

    @GetMapping(value = "/{localId}")
    public TiendaRestDto getUser(@PathVariable String localId) {
        log.info("Getting store ID: {}.", localId);
        return findByLocalId.find(localId).map(TiendaRestDto::from).orElseThrow(() -> new InvalidParameterException("Tienda not found"));
    }

    @GetMapping(value = "cadena/{cadena}")
    public List<TiendaRestDto> getTiendasByCadena(@PathVariable String cadena) {
        log.info("Getting cadena : {}.", cadena);
        return findByCadena.find(cadena).stream().map(TiendaRestDto::from).collect(Collectors.toList());
    }
}
