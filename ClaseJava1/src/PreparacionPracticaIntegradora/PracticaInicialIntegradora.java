package PreparacionPracticaIntegradora;

import static jdk.internal.joptsimple.internal.Strings.repeat;

public class PracticaInicialIntegradora {
    public static void main(String args[]) {
        //System.out.println(replicate('a',3));

        //System.out.println(lpad("80",5,'0'));

        //int[] arr = new int[]{10,40,60,150};
        //System.out.println(toStringArray(arr));

        //String[] arr = new String[]{"3","6","50","26"};
        //System.out.println(toIntArray(arr));

        String[] arr = new String[]{"34","22","333","66"};
        //System.out.println(maxLength(arr));

        lNormalize(arr,'0');



    }
    //Ejercicio1
    public static String replicate(char c, int n){
        String cadenaFinal = "";
        for (int i = 0; i<n;i++){
            cadenaFinal = new StringBuilder().append(cadenaFinal).append(Character.toString(c)).toString();
        }
        return cadenaFinal;
    }
    //Ejercicio2
    public static String lpad(String s, int n, char c){
        int digitosNumeroOriginal = (int)(Math.log10(Integer.parseInt(s))+1);
        String numeroFinal;
        StringBuffer sb = new StringBuffer(n - digitosNumeroOriginal);
        for (int i = 0; i < n - digitosNumeroOriginal; i++){
            sb.append(c);
        }
        numeroFinal = sb.toString();
        return numeroFinal+s;
    }
    //Ejercicio3
    public static String[] toStringArray(int arr[]){
        String[] arrString = new String[arr.length];
        for(int i = 0; i< arr.length;i++){
            arrString[i] = String.valueOf(arr[i]);
        }
        return arrString;
    }

    //Ejercicio4
    public static int[] toIntArray(String arr[]){
        int[] arrInt = new int[arr.length];
        for(int i = 0; i< arr.length;i++){
            arrInt[i] = Integer.valueOf(arr[i]);
        }
        return arrInt;
    }

    //Ejercicio5
    public static int maxLength(String arr[]){
        int max = 0;
        for (int i=0; i<arr.length;i++){
            if (max<arr[i].length()){
                max = arr[i].length();
            }
        }
        return max;
    }

    //Ejercicio6
    public static void lNormalize(String arr[],char c){
        int max = 0;
        for (int i=0; i<arr.length;i++){
            if (max<arr[i].length()){
                max = arr[i].length();
            }
        }
        for (int i = 0; i<arr.length;i++){
            System.out.println(lpad(arr[i],max,c));
        }

    }
}
