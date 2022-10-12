package cl.forus.integradormongodb.core.domain;

import cl.forus.integradormongodb.infrastructure.presentation.rest.TiendaRestDto;
import cl.forus.integradormongodb.infrastructure.repository.mongo.Ubicacion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TiendaBuilder {
    @Id
    private String _id;
    private String localId;
    private String nombre;
    private String cadena;
    private String localTipo;
    private String direccion;
    private String telefono;
    private Ubicacion ubicacion;
    private String apertura;
    private String cierre;
    private boolean activo;
    private int capMax;
    private int ranking;
    private String comuna;
    private String region;
    private int regionId;
    private boolean cncActivo;
    private String emailJefeTienda;
    private int rankingEstatico;
    private int prioridad;
    private boolean cd;
    private boolean regionMetropolitana;
    private String codigoPostal;
    private String nombre_alt;
    private boolean emiteGuiaDespacho;
    private boolean cobroDespacho;
    private Date updateDate;
    private String userUpdate;
    private String _class;
}
