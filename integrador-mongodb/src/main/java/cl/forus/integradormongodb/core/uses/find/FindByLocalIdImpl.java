package cl.forus.integradormongodb.core.uses.find;

import cl.forus.integradormongodb.core.domain.Tienda;
import cl.forus.integradormongodb.core.domain.repository.TiendaFinder;

import java.util.Optional;

public class FindByLocalIdImpl implements FindByLocalId {

    private final TiendaFinder tiendaFinder;

    public FindByLocalIdImpl(TiendaFinder tiendaFinder) {this.tiendaFinder = tiendaFinder;}

    @Override
    public Optional<Tienda> find(String localId) {
        return tiendaFinder.findByLocalId(localId);
    }
}
