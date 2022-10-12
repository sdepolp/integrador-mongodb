package cl.forus.integradormongodb.core.uses.find;

import cl.forus.integradormongodb.core.domain.Tienda;
import cl.forus.integradormongodb.core.domain.repository.TiendaFinder;

import java.util.List;

public class FindByCadenaImpl implements FindByCadena {

    private final TiendaFinder tiendaFinder;

    public FindByCadenaImpl(TiendaFinder tiendaFinder) {this.tiendaFinder = tiendaFinder;}

    @Override
    public List<Tienda> find(String cadena){
        return tiendaFinder.getStoresByChain(cadena);
    }
}
