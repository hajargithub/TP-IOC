package ma.enset.dao;

public class DaoImp  implements IDao{
    @Override
    public double getData() {
        System.out.println("Version de BDD");
        double t=40;
        return t;
    }
}
