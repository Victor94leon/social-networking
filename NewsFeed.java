import java.util.ArrayList;
public class NewsFeed
{
    public ArrayList<MessagePost> messages;
    public ArrayList<PhotoPost> photos;

    /**
     * Constructor de objetos de la clase NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<MessagePost>();
        photos = new ArrayList<PhotoPost>();
    }

    /**
     * Añade un MessagePost
     */
    public void addMessagePost(MessagePost message) {
        messages.add(message);
    }

    /**
     * Añade un PhotoPost
     */
    public void addPhotoPost(PhotoPost photo) {
        photos.add(photo);
    }

    /**
     * Muestra los post por pantalla
     */
    public void show() {
        for(MessagePost postEnLista : messages) {
            postEnLista.display();
            System.out.println("***************************************");
        }
        for(PhotoPost postEnLista : photos) {
            postEnLista.display();
            System.out.println("***************************************");
        }
    }
}