public class Main {
    public static void main(String[] args) {
        String nombre = "Leonardo";
        double[] calificaciones = {70,50,90,80,100};

        imprimir(nombre,calificaciones,promedio(calificaciones),calificacion(promedio(calificaciones)));
    }
    private static void imprimir(String nombre, double[] arreglo, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Calificación " + (i + 1) + ": " + arreglo[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificacion: " + calificacion);
    }
    private static double promedio(double[] arreglo){
        double suma = 0;
        for (int i = 0 ; i < 5 ; i++){
            suma += arreglo[i];
        }
        return suma/5;
    }
    private static char calificacion(double promedio){
        if (promedio <= 50) {
            return 'F';
        } else if (promedio >= 51 && promedio <= 60) {
            return 'E';
        } else if (promedio >= 61 && promedio <= 70) {
            return 'D';
        } else if (promedio >= 71 && promedio <= 80) {
            return 'C';
        } else if (promedio >= 81 && promedio <= 90) {
            return 'B';
        } else if (promedio >= 91 && promedio <= 100) {
            return 'A';
        }
        return 'X';
    }
}