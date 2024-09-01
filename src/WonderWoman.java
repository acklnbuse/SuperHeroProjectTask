
public class WonderWoman extends SuperHeroes {
    private String lassoOfTruthAbility;
    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String lassoOfTruthAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setLassoOfTruthAbility(lassoOfTruthAbility);
    }

    public String getLassoOfTruthAbility() {
        return lassoOfTruthAbility;
    }

    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(lassoOfTruthAbility+"lassoOfTruthAbility");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(getName()+"Truth Lasso'yu oyuncuya bildirir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+"Truth Lasso'yu oyuncuya bildirir.");
    }
}
