package cl.forus.integradormongodb.core.uses.find;

import cl.forus.integradormongodb.core.domain.Tienda;

import java.util.List;

public interface FindByCadena {
    List<Tienda> find(String cadena);
}
