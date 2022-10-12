package cl.forus.integradormongodb.core.uses.find;

import cl.forus.integradormongodb.core.domain.Tienda;
import cl.forus.integradormongodb.core.domain.repository.TiendaFinder;

import java.util.List;

public class FindAllImpl implements FindAll{
    private final TiendaFinder tiendaFinder;

    public FindAllImpl(TiendaFinder tiendaFinder) {
        this.tiendaFinder = tiendaFinder;
    }
    @Override
    public List<Tienda> get() {
        return tiendaFinder.getAll();
    }
}
