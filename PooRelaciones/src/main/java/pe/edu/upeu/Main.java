package pe.edu.upeu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> prod = new ArrayList<>();

        prod.add(new Producto("P001", "Televisor", 4000, 20));
        prod.add(new Producto("P002", "Parlantes", 2000));

        System.out.println("Nombre  "+"\t"+"Precio"+"\t"+"Sttok"+"\t"+"IGV");
        for (Producto p : prod){
            System.out.println(p.nombre+"\t"+p.precio+"\t"+p.stock+"\t    "+p.igv);
        }
    }
}