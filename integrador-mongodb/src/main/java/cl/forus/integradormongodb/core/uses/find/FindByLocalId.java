package cl.forus.integradormongodb.core.uses.find;

import cl.forus.integradormongodb.core.domain.Tienda;

import java.util.Optional;

public interface FindByLocalId {
    Optional<Tienda> find(String localId);
}
