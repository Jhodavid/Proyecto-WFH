package Controller;

/**
 *
 * @author jhoda
 */
public class Encriptacion {

    public String Cifrado(String pass) {
        
        char Array[] = pass.toCharArray();
        int N = Array.length;
        int C = N;
        for (int i = 0; i < N; i++) {
            Array[i] = (char) (Array[i] + (char) C);
            C--;

        }
        for (int i = 0; i < N - 1; i++) {
            
                char aux = Array[i];
                Array[i] = Array[i + 1];
                Array[i + 1] = aux;
           
        }
        for (int i = 0; i < N; i++) {

            Array[i] = (char) (Array[i] + (char) i);

        }
        for (int i = 0; i < N - 2; i++) {

            char aux = Array[i];
            Array[i] = Array[i + 2];
            Array[i + 2] = aux;

        }
        for (int i = 0; i < N; i++) {
            int k = 1 - i + 4;
            Array[i] = (char) (Array[i] + (char) i + k);

        }
        for (int i = 0; i < N - 1; i++) {

            char aux = Array[i];
            Array[i] = Array[N - i - 1];
            Array[N - i - 1] = aux;

        }
        String Encriptado = String.valueOf(Array);
        return Encriptado;
    }

    public String Desencriptado(String Encriptado) {
        char array[] = Encriptado.toCharArray();
        int N = array.length;
        int C = N;
        for (int i = 0; i < N-1; i++) {
            char aux = array[i];
            array[i] = array[N - i - 1];
            array[N - i - 1] = aux;
        }
        for (int i = 0; i < N; i++) {
            int k = 1 - i + 4;
            array[i] = (char) (array[i] - ((char) (i + k)));

        }
        for (int i = 0; i < N - 1; i++) {
            if (array[i] > array[i + 1]) {
                char aux = array[i];
                array[i] = array[i + 1];
                array[i + 1] = aux;
            }
        }
        for (int i = N - 1; i > 1; i--) {

            char aux = array[i];
            array[i] = array[i - 2];
            array[i - 2] = aux;

        }
        for (int i = 0; i < N; i++) {

            array[i] = (char) (array[i] - (char) i);

        }
        for (int i = N-1; i > 0; i--) {
            
                char aux = array[i];
                array[i] = array[i - 1];
                array[i - 1] = aux;
           
        }
        
        for (int i = 0; i < N; i++) {
            array[i] = (char) (array[i] - (char) C);
            C--;

        }
String Dcifrado = String.valueOf(array);
return Dcifrado;
    }
}
