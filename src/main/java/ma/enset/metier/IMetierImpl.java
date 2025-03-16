package ma.enset.metier;

import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metrier")
public class IMetierImpl implements IMetier {
    @Autowired//Injection automatique
    @Qualifier("d")
    private IDao dao ; // Coublage faible
    @Override
    public double calcul() {
      double t= dao.getData();
      double res=t*0.5;
      return res;
    }
    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDAO
     *au moment de l'instantiation
     */

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    public IMetierImpl() {
    }

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDAO
     *après Instantiation
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
