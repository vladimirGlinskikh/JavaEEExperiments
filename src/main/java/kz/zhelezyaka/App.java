package kz.zhelezyaka;

import kz.zhelezyaka.models.Car;
import kz.zhelezyaka.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/");
        configuration.setProperty("hibernate.connection.username", "");
        configuration.setProperty("hibernate.connection.password", "");
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty("hibernate.hbm2ddl.auto", "update");

        configuration.addResource("User.hbm.xml");
        configuration.addAnnotatedClass(Car.class);
        configuration.setProperty("hibernate.show_sql", "true");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        User user = session.createQuery("from User user where user.id = 1", User.class).getSingleResult();
        session.beginTransaction();
        session.save(new User("Tatiana", "Lozova", 34));
        session.getTransaction().commit();
        System.out.println(user);

        List<Car> car = session.createQuery("from Car car", Car.class).getResultList();
        int i = 0;
    }
}
