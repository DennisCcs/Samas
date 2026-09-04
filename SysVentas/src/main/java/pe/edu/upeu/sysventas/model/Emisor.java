package pe.edu.upeu.sysventas.model;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Emisor {
    long idEmisor;
    String ruc;
    String nomdbreComercial;
    String ubigeo;
    String domicilioFIscal;
    String urbanizacion;
    String departamiento;
    String provincia;
    String distrito;
}
