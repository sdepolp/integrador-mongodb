package cl.forus.integradormongodb.infrastructure.presentation.rest;

import cl.forus.integradormongodb.core.domain.Tienda;
import cl.forus.integradormongodb.infrastructure.repository.mongo.TiendaDto;
import cl.forus.integradormongodb.infrastructure.repository.mongo.Ubicacion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tiendasWoodstock")
public class TiendaRestDto {

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

    public static TiendaRestDto from(Tienda tienda) {
        return new TiendaRestDto(tienda.get_id(),
                tienda.getLocalId(),
                tienda.getNombre(),
                tienda.getCadena(),
                tienda.getLocalTipo(),
                tienda.getDireccion(),
                tienda.getTelefono(),
                tienda.getUbicacion(),
                tienda.getApertura(),
                tienda.getCierre(),
                tienda.isActivo(),
                tienda.getCapMax(),
                tienda.getRanking(),
                tienda.getComuna(),
                tienda.getRegion(),
                tienda.getRegionId(),
                tienda.isCncActivo(),
                tienda.getEmailJefeTienda(),
                tienda.getRankingEstatico(),
                tienda.getPrioridad(),
                tienda.isCd(),
                tienda.isRegionMetropolitana(),
                tienda.getCodigoPostal(),
                tienda.getNombre_alt(),
                tienda.isEmiteGuiaDespacho(),
                tienda.isCobroDespacho(),
                tienda.getUpdateDate(),
                tienda.getUserUpdate(),
                tienda.get_class()
        );
    }

}
