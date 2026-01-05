public class Short {
    
    //atributos
    String titulo;
    String img;
    String url;
    int likes;
    int visualizaciones;
    
    //Constructor(es)
    public Short (){
        //por defecto
    }   

    public Short (String titulo, String img){
        this.titulo = titulo;
        this.img = img;
    }

    //getters: permiten consultar los valores de los atributos
    public int getLikes(){
        return this.likes;
    }

    public String getTitulo(){
        return this.titulo;
    }
}
