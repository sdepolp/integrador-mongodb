package cl.forus.integradormongodb.core.domain.repository;

import cl.forus.integradormongodb.core.domain.Tienda;

import java.util.List;
import java.util.Optional;

public interface TiendaFinder {


        List<Tienda> getAll();

        Optional<Tienda> findByLocalId(String localId);

        List<Tienda> getStoresByChain(String cadena);

}
