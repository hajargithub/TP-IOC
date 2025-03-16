package ma.enset.presentation;

import ma.enset.ext.DaoImpV2;
import ma.enset.metier.IMetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpV2 d = new DaoImpV2();
        //DaoImp d = new DaoImp();
        //Injection des dépendances via Constructeur avec Paramètre
        IMetierImpl metier=new IMetierImpl(d);
        //metier.setDao(d); //Injection des dépendances via le setter
        System.out.println("Res= "+metier.calcul());
    }
}
