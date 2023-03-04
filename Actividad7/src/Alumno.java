public class Alumno {
    private String nombre;

    private int [] calificacion;

    private float promedio;






    public Alumno(String nombre, int []calificacion, float promedio) {

        this.nombre = nombre;
        this.calificacion = calificacion;
        this.promedio= promedio;


    }

    public void Imprimir(){
        System.out.println("El nombre del Alumno es: "+nombre);
        System.out.println("El promedio del alumno es: "+promedio);
        System.out.println("Los calificaciones obtenidas son: ");
        for (int i=0; i<5; i++){
            System.out.println(calificacion[i]+" ");


        }


    }



}
