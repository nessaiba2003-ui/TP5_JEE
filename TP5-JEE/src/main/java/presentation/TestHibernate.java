package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import util.HibernateConfig;

public class TestHibernate {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        System.out.println("SessionFactory est configuré correctement!!");

        HibernateTransactionManager txManager = context.getBean(HibernateTransactionManager.class);
        if (txManager != null)
            System.out.println("Transaction Manager est configuré correctement!!");
        else
            System.out.println("Transaction Manager non trouvé");
    }
}
