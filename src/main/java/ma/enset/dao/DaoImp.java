package ma.enset.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d")
public class DaoImp  implements IDao{
    @Override
    public double getData() {
        System.out.println("Version de BDD");
        double t=40;
        return t;
    }
}
