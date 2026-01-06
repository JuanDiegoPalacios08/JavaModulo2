import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        String user = sc.nextLine();

        System.out.println("Ingrese su biografia: ");
        String bio = sc.nextLine();

        //Instanciar la clase
        PerfilInstagram miPerfil = new PerfilInstagram(user,bio);
        System.out.println("El perfil fue creado exitosamente.");

        miPerfil.setUserName("Catalina1238"); //editar el nombre del perfil
        miPerfil.follow();

        miPerfil.toString();

        sc.close();
    }
}
