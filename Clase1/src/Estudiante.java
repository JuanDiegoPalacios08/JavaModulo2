
public class Estudiante {
    // atributos privadors (encapsulamiento)
    private String nombre;
    private int edad;
    private double promedio;
    private String estado; // activo,inactivo, graduado
    private int creditosAprobados;

    // constructor vacio
    public Estudiante() {
        this.nombre = "sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
        this.estado = "inactivo";
        this.creditosAprobados = 0;
    }

    // constructor con parametros
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public Estudiante(String nombre, int edad, double promedio, String estado, int creditosAprobados) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.estado = estado;
        this.creditosAprobados = creditosAprobados;
    }

    /*
     * GETTER -> OBTENER
     * public tipoDeDato getNombre(){
     * return nombre;
     * }
     */

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio(){
        return promedio;
    }

    public String getEstado(){
        return estado;
    }
    
    public int getCreditosAprobados(){
        return creditosAprobados;
    }

    /* SETTER: (Permite editar el contenido del atributo) -> con validaciones
        public void setNombre(String nombre){

        }
    */
   public void setNombre(String nombre){
    if (nombre != null & !nombre.trim().isEmpty()) {
        this.nombre = nombre;
    }else{
        System.out.println("Error: El nombre no puede estar vacio.");
    }
    }
    //setter de edad
    public void setEdad (int edad){
        if (edad >= 15 && edad <= 100) {
            this.edad = edad;
        }else{
            System.out.println("Error: Edad invalidad debe de estar entre 15 y 100");
        }
    }

    public void setPromedio(double promedio){
        if (promedio >= 0.0 && promedio <= 5.0) {
            this.promedio = promedio;
            actulizarEstadoPromedio();
        }else{
            System.out.println("Promedio invalido");
        }
    }
    
    public void setEstado(String estado){
        switch (estado) {
            case "Activo":
            case "inactivo":
            case "graduado":
                this.estado = estado;
                break;
        
            default:
                System.out.println("Error: Estado invalido");
            break;
        }
    }

    public void setCreditosAprobados(int creditosAprobados){
        //validacion con operadores ternario
        this.creditosAprobados = (creditosAprobados >=0)? creditosAprobados: 0;
    }

    // metodos que hacen operaciones internas dentro de una clase van privados
    private void actulizarEstadoPromedio(){
        if (this.promedio >= 3.0) {
            this.estado = "Activo";
        }else if (this.promedio <= 2.0) {
            System.out.println("Advertencia promedio bajo");
        }else{
            this.estado = "Inactivo";
            System.out.println("Estudiante en riesgo academico");
        }
    }

    public String obtenerCalificacion(){
        String calificacion;
        int promedioEntero = (int) this.promedio;

        switch (promedioEntero) {
            case 5:
                calificacion = "Excelente";
                break;
            case 4:
                calificacion = "Sobresliente";
                break;
            case 3:
                calificacion = "Aceptable";
                break;
            case 2:
                calificacion = "Insuficiente";
                break;

            default:
                calificacion = "Deficiente";
                break;
        }
        return calificacion;
    }

    //metodo para devolver si esta aprovado(true/false)
    public boolean estaAprobado(){
        return (this.promedio >= 3.0) ? true: false;
    }

    //Estado academico
    public String obtenerEstadoAcademico(){
        return (this.promedio >= 3.0) ? "Aprobado": "Reprobado";
    }

    //metodo para mostrar la informacion
    public void mostrarInformacion(){
        System.out.println("Informacion del estudiante.");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Promedio: "+this.promedio);
        System.out.println("Estado: "+this.estado);
        System.out.println("Creditos aprovados: "+this.creditosAprobados);
        System.out.println("Calificaciones: "+obtenerCalificacion());
        System.out.println("Puede Graduarse: "+(puedeGraduarse()? "Si": "No"));
    }

    private boolean puedeGraduarse(){
        return (this.creditosAprobados >= 160 && this.promedio >=3.0)? true :false;
    }

}
