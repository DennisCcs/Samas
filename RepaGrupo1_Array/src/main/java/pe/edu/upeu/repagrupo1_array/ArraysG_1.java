package pe.edu.upeu.repagrupo1_array;
public class ArraysG_1 {
    public static int[] ejemploVector(){
        int[] v = {15,20,16,12,8};
        System.out.println(v.length);
        v[2] = 10;
        return  v;
    }
    public static void imprimeVector(int[] v){
        for (int i = 0; i < v.length;i ++){
            System.out.printf(v[i]+"\t");
        }
    }

    public static void imprimeMatriz(int[][] m){
        for (int f=0;f<m.length;f++){
            for (int c=0;c<m[0].length;c++){
                System.out.print(m[f][c]+"\t");
            }
            System.out.println("");
        }
    }

    public static int[][] matrizF5(int tam , int numI){
        int[][] m = new int[tam][tam];
        for (int f = 0; f < m.length; f++) {
            for (int c = m[0].length-1; c >= m[0].length-1-f; c--) {
                m[f][c]=numI;
                numI++;
            }
        }
        return m;
    }

    public static int[][] matrizF6(int tam, int num1){
        int[][] m = new int[tam][tam];
        for (int f = 0; f < m.length; f++) {
            for (int c = m[0].length-1; c >= m[0].length-1-f; c++) {
            m[f][c]=num1;
            num1++;
            }

        }
        return m;
    }

    public static void main(String[] args) {
        //imprimeVector(ejemploVector());
        System.out.println("");
        int[][] m = {{2,3},{4,6},{9,10}};
        //imprimeMatriz(m);
        imprimeMatriz(matrizF5(5,0));
        imprimeMatriz(matrizF5(5,0));
    }
}
