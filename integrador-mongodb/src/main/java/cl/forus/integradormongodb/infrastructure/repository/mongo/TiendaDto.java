package cl.forus.integradormongodb.infrastructure.repository.mongo;

import cl.forus.integradormongodb.core.domain.Tienda;
import cl.forus.integradormongodb.infrastructure.presentation.rest.TiendaRestDto;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tiendasWoodstock")
public class TiendaDto {

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

    public Tienda toDomain(){
        return Tienda.builder()
                ._id(_id)
                .localId(localId)
                .nombre(nombre)
                .cadena(cadena)
                .localTipo(localTipo)
                .direccion(direccion)
                .telefono(telefono)
                .ubicacion(ubicacion)
                .apertura(apertura)
                .cierre(cierre)
                .activo(activo)
                .capMax(capMax)
                .ranking(ranking)
                .comuna(comuna)
                .region(region)
                .regionId(regionId)
                .cncActivo(cncActivo)
                .emailJefeTienda(emailJefeTienda)
                .rankingEstatico(rankingEstatico)
                .prioridad(prioridad)
                .cd(cd)
                .regionMetropolitana(regionMetropolitana)
                .codigoPostal(codigoPostal)
                .nombre_alt(nombre_alt)
                .emiteGuiaDespacho(emiteGuiaDespacho)
                .cobroDespacho(cobroDespacho)
                .updateDate(updateDate)
                .userUpdate(userUpdate)
                ._class(_class)
                .build();
    }

}
