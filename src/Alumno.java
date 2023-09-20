import java.security.PublicKey;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Alumno {
    private Scanner reader;

    //**********  Definición de Porpiedades de la Clase Alumno **********//
    public ArrayList<Integer> listacalificaciones = new ArrayList<Integer>();
    public int promedio;
    public String califLetra;
    public String nombre_alumno;


    //**********  Definición de Métodos de la Clase Alumno **********//
    public int IngresaCalificacion(int num_calif)
    {
        this.reader = new Scanner(System.in);
        System.out.println("Ingresa la calificación : " + num_calif);
        int calif = reader.nextInt();
        return calif;
    }

    public String IngresaNombre()
    {
        this.reader = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Alumno : \n");
        return reader.nextLine();
    }

    public int CalculaPromedio(List<Integer> lstcalif)
    {
        int sumacalif = 0;
        int promedio = 0;
        for (int count = 0; count < 5; count++)
        {
            sumacalif += lstcalif.get(count);

        }
        promedio = (sumacalif/5);
        return promedio;
    }

    public String CalculaCalifLetra (int promedio)
    {
        if (promedio <= 50)
        {
            return "F";

        }else if (promedio > 50 && promedio <= 60)
        {
            return "E";
        } else if (promedio > 60 && promedio <= 70)
        {
            return "D";
        }else if (promedio > 70 && promedio <= 80)
        {
            return "C";
        }else if (promedio > 80 && promedio <= 90)
        {
            return "B";
        }else
        {

            return "A";
        }
    }

    public void ImprimeResultados(Alumno alumno)
    {
        System.out.println("Estudiante :" + alumno.nombre_alumno);
        System.out.println("Calificación 1 obtenida : " + alumno.listacalificaciones.get(0));
        System.out.println("Calificación 2 obtenida : " + alumno.listacalificaciones.get(1));
        System.out.println("Calificación 3 obtenida : " + alumno.listacalificaciones.get(2));
        System.out.println("Calificación 4 obtenida : " + alumno.listacalificaciones.get(3));
        System.out.println("Calificación 5 obtenida : " + alumno.listacalificaciones.get(4));
        System.out.println("El Promedio obtenido es de  :" + alumno.promedio);
        System.out.println("La calificación final es  :" + alumno.califLetra);

    }

    // ****** Main *****//
    public static void main(String[] args) {
         Alumno alumno = new Alumno();
         alumno.nombre_alumno = alumno.IngresaNombre();

         for (int count = 0; count < 5; count++)
        {
            alumno.listacalificaciones.add(alumno.IngresaCalificacion(count+1));
        }
         alumno.promedio = alumno.CalculaPromedio(alumno.listacalificaciones);
         alumno.califLetra=  alumno.CalculaCalifLetra(alumno.promedio);
         alumno.ImprimeResultados(alumno);

    }
}