package ma.enset.metier;

import ma.enset.dao.IDao;

public class IMetierImpl implements IMetier {
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
