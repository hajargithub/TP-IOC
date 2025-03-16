package ma.enset.ext;

import ma.enset.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImpV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs : ");
        double t=Math.PI*35;
        return t;
    }
}
