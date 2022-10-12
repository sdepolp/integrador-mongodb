package cl.forus.integradormongodb.infrastructure.config;

import cl.forus.integradormongodb.core.domain.repository.TiendaFinder;
import cl.forus.integradormongodb.core.uses.find.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UseCaseFactory {

    @Bean
    FindAll findAll(TiendaFinder findAll){ return new FindAllImpl(findAll); }

    @Bean
    FindByLocalId findById(TiendaFinder findAll){ return new FindByLocalIdImpl(findAll);}

    @Bean
    FindByCadena findByCadena(TiendaFinder findAll){ return new FindByCadenaImpl(findAll);}
}
