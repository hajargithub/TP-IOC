package ma.enset.presentation;

import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
    Scanner sc = new Scanner(new File("config.txt"));
   String daoClassName = sc.nextLine();
        /**Instantiation Dynamique
         * Charger la class en Memoire
         */
        Class cDao= Class.forName(daoClassName);
         IDao d= (IDao) cDao.newInstance();//Constructeur Sans Params
        System.out.println(d.getClass());
       System.out.println(d.getData());

        String metierClassName = sc.nextLine();
        /**Instantiation Dynamique
         * Charger la class en Memoire
         */
        Class cMetier= Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance(d);;//Constructeur Sans Params
        System.out.println("Metier: "+metier.getClass());
        System.out.println("RES : "+ metier.calcul());


    }
}
