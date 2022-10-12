package cl.forus.integradormongodb.infrastructure.repository.mongo;

import cl.forus.integradormongodb.core.domain.Tienda;
import cl.forus.integradormongodb.core.domain.repository.TiendaFinder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Repository
@Profile("mongo")
@Slf4j
public class TiendaMongoRepository implements TiendaFinder {

    private final MongoDAO mongoDAO;

    public TiendaMongoRepository(MongoDAO mongoDAO) { this.mongoDAO = mongoDAO; }

    @Override
    public List<Tienda> getAll() {
        List<TiendaDto> all = mongoDAO.findAll();
        return mapList(all);
    }

    @Override
    public Optional<Tienda> findByLocalId(String localId) {
        log.info("localId : {}",localId);
        Optional<Tienda> respTiendaMongo = mongoDAO.findByLocalId("1").stream().map(TiendaDto::toDomain).findFirst();
        log.info("respTiendaMongo : {}",respTiendaMongo.toString());
        return respTiendaMongo;
        //return mongoDAO.findByLocalId(localId).map(TiendaDto::toDomain);

    }

    public List<Tienda> getStoresByChain(String cadena){
        return mongoDAO.findByCadena(cadena).stream().map(TiendaDto::toDomain).collect(Collectors.toList());
    }

    private static List<Tienda> mapList(List<TiendaDto> allByStatus) {
        return allByStatus.stream().map(TiendaDto::toDomain).collect(Collectors.toList());
    }
}