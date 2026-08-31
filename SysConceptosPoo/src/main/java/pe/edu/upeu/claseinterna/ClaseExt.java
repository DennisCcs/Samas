package pe.edu.upeu.claseinterna;

public class ClaseExt {

    class claseIntuno{
        void saludo(){
            System.out.println("SOy clse intera uno");
        }
    }

    class ClaINtDos{
        void saludo(){
            System.out.println("SOy clse intera uno");
        }

        static void mostrarInformacion(){
            System.out.println("LOs metodos staticos se pueden llamar de forma directa");
        }

    }

    public static void main(String[] args){
        ClaseExt ce = new ClaseExt();
        claseIntuno ceI = ce.new claseIntuno();
        ceI.saludo();
        ClaINtDos CeII =ce.new ClaINtDos();
        CeII.saludo();
        ClaINtDos.mostrarInformacion();
    }

}
