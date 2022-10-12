package cl.forus.integradormongodb.infrastructure.repository.mongo;

import cl.forus.integradormongodb.core.domain.Tienda;
import cl.forus.integradormongodb.core.domain.repository.TiendaFinder;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Profile("mongo")
public interface MongoDAO extends MongoRepository<TiendaDto,String> {

    List<TiendaDto> findAll();

    List<TiendaDto> findByLocalId(String localId);

    List<TiendaDto> findByCadena(String cadena);
}
