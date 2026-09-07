package pe.edu.upeu.sysventas.model;

import lombok.Data;

@Data
public class DocumentoComercial {

    Long id;
    double precioBase;
    double igv;
    double precioTotal;
    String serie;
    String numDoc;
    String tipoDoc;

    public  double calcularTotal(){
        return  precioTotal;
    }
}
