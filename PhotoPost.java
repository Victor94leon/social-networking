import java.util.ArrayList;
public class PhotoPost
{
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor de objetos de la clase PhotoPost
     */
    public PhotoPost(String author,String filename, String caption){
        username = author;
        this.filename = filename;
        this.caption = caption;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<String>();
    }  

    /**
     * Incrementa en uno los likes
     */
    public void like() {
        likes++;
    }

    /**
     * Decrementa en uno los likes si son mayores que 0
     */
    public void unlike() {
        if(likes>=1) {
            likes--;
        }
    }

    /**
     * Añade un comentario
     */
    public void addComment(String text) {
        comments.add(text);
    }

    /**
     * Devuelve el nombre del arhcivo
     */
    public String getImageFile() {
        return filename;
    }

    /**
     * Devuelve el caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Devuelve el tiempo de creación
     */
    public long getTimeStamp() {
        return timestamp;
    }

    /**
     * Muestra por pantalla la información del post
     */
    public void display() {
        System.out.println("Autor: " + username
            + "\nNombre del archivo: " + filename
            + "\nCaption: " + caption
            + "\nCreado hace: " + timeString(System.currentTimeMillis())
            + "\nLikes: " + likes);
        if(comments.size()>0) {
            System.out.println("Comentarios:");
            for(int i = 0; i<comments.size(); i++) {
                System.out.println(comments.get(i));
            }
        }
        else {
            System.out.println("No hay ningún comentario");
        }
    }

    /**
     * Devuelve un String que representa el momento de creación del post
     */
    public String timeString(long time) {
        int segundos = (int)(time - timestamp)/1000;
        String cadena = segundos + " segundos";
        if(segundos>=60) {
            int minutos = segundos/60;
            segundos = segundos%60;
            cadena = minutos + " minutos " + segundos + " segundos";
            if(minutos>=60) {
                int horas = minutos/60;
                minutos = minutos%60;
                cadena = horas + " horas " + minutos + " minutos " + segundos + " segundos";
            }
        }
        return cadena;
    } 
}
