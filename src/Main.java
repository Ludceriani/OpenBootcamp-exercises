import com.innova.Coche;

public class Main {
    public static void main(String[] args) {
        //Lamada a la función
        sumaDe3Param(2,56,8);

        Coche miCoche = new Coche();
        miCoche.AumentarNumDePuertas();
        miCoche.AumentarNumDePuertas();
        System.out.println(miCoche.numDePuertas);

    }

    //Función que imprime la suma tres parametros
    public static void sumaDe3Param(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }
}