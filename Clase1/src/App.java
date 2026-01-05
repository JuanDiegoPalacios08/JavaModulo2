public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==========================================");
        System.out.println(" Demostracion de encapsulamiento en java ");
        System.out.println("==========================================");

        //constructor vacio
        System.out.println("Contructores");
        Estudiante est1 = new Estudiante();
        System.out.println("Contrusctutor vacio");
        System.out.println("Nombre: "+est1.getNombre());
        System.out.println("Estado: "+est1.getEstado());

        //constructor con parametros
        Estudiante est2 = new Estudiante("Ana garcia", 20, 4.5);
        System.out.println("Contrustor con 3 parametros");
        System.out.println("Nombre: "+est2.getNombre());
        System.out.println("Edad: "+est2.getEdad());
        System.out.println("Promedio: "+est2.getEstado());

        //contructor con los parametros completos
        Estudiante est3 = new Estudiante("Carlos", 23, 3.8, "Activo", 120);
        System.out.println("Constructor con Parametros completos");
        System.out.println("Nombre: "+est3.getNombre());
        System.out.println("Creditos: "+est3.getCreditosAprobados());

        //Setters
        System.out.println("Setters con validacion de if else");
        Estudiante estudiante = new Estudiante();
        System.out.println("Probando setNombre");
        estudiante.setNombre("maria lopez");
        System.out.println("Nombre establecido: "+estudiante.getNombre());

        System.out.println("Edad");
        estudiante.setEdad(78);
        System.out.println("Edad establecido para el estudiante "+estudiante.getEdad());

        System.out.println("Promedio");
        estudiante.setPromedio(4.2);
        System.out.println("Promedio establecido "+estudiante.getPromedio());

        //Demostracion con el switch
        System.out.println("Probando el switch");
        estudiante.setEstado("Activo");
        System.out.println("Estado establecido "+estudiante.getEstado());

        //Calificar el promedio
    }
}
