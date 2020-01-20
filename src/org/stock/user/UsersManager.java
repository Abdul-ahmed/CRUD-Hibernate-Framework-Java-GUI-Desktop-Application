package org.stock.user;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsersManager {
    
    private final SessionFactory factory;
    private final Session session;
    private Query query;
    private List listOfData;
    private List logins;

    public UsersManager() {
        factory = new Configuration().configure().buildSessionFactory();
        session = factory.getCurrentSession();
        session.beginTransaction();
    }
    
    public void AddUser (UsersDeclarationClass udcn) {
        session.save(udcn);
        session.getTransaction().commit();
        
    }
    
    public void DeleteUser (long id, String level, boolean status, String pass) {
        
       System.out.println( id + " " + level + " " + status + " "); 
       UsersDeclarationClass acct =(UsersDeclarationClass) session.get(UsersDeclarationClass.class, id);
       
       acct.setLevels(level);
       acct.setStatus(status);
       acct.setPassword(pass);
       
        System.out.println(acct.getId() + " " + acct.getLevels() + " " + acct.isStatus()  + " " + acct.getPassword() );
        session.delete(acct);
        session.getTransaction().commit();
    }
    
    public void fillTable (AddUsers userFrame){
        
        query = session.createQuery("from UsersDeclarationClass");
        listOfData = query.list();
        Object data[][] = new Object[listOfData.size()][4];
        
        int count = 0;   
            for (UsersDeclarationClass users : (List<UsersDeclarationClass>) listOfData) {
                System.out.print("Hello World!" + users.getId());
                data[count][0] = (Object) users.getId();
                data[count][1] = (Object) users.getUsername();
                data[count][2] = (Object) users.getLevels();
                data[count][3] = (Object) users.isStatus();
                count++;
        } userFrame.setTable(data);
        
    }
        
    public void updateUser(long id, String level, boolean status, String pass) {
        
       System.out.println( id + " " + level + " " + status + " "); 
       UsersDeclarationClass acct =(UsersDeclarationClass) session.get(UsersDeclarationClass.class, id);
       
       acct.setLevels(level);
       acct.setStatus(status);
       acct.setPassword(pass);
       
       System.out.println(acct.getId() + " " + acct.getLevels() + " " + acct.isStatus()  + " " + acct.getPassword() );
       
       session.update(acct);
       session.getTransaction().commit();
        
    }
    
    public boolean loginUser(String username, String password){
        UsersDeclarationClass loginclass = new UsersDeclarationClass();
        
        query = session.createQuery("from UsersDeclarationClass where username=:user and password=:pass");
        query.setParameter("user", username);
        query.setParameter("pass", password);
        logins = query.list();
        
        return(logins.size()>0);

    }
    
}
