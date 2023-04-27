import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        
        // Create a configuration object
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        
        // Create a session factory object
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Open a session
        Session session = factory.openSession();
        
        // Begin a transaction
        session.beginTransaction();
        
        // Create a new theater object
        Theater theater = new Theater("Cineplex");
        
        // Create some movie objects
        Movie m1= new  Movie("Avengers the end game");
        Movie m2= new Movie("Alladin");
       Movie m3= new Movie("Dragon tails");
        
        // Add the movies to the theater
        theater.addMovie(m1);
        theater.addMovie(m2);
        theater.addMovie(m3);
        
        // Save the theater object
        session.save(theater);
        
        // Commit the transaction
        session.getTransaction().commit();
        
        // Close the session
        session.close();
        
        // Print a message to indicate that the data has been saved
        System.out.println("Data saved successfully!");
    }
}
