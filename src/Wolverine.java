
public class Wolverine extends SuperHeroes {
    private String adamantiumClaws;

    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty, String adamantiumClaws){
        super(name, gender, aggression, wisdom, beauty);
        this.adamantiumClaws = adamantiumClaws;
    }

    public String getAdamantiumClaws() {
        return adamantiumClaws;
    }

    public void setAdamantiumClaws(String adamantiumClaws) {
        this.adamantiumClaws = adamantiumClaws;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(adamantiumClaws+ "adamantiumClaws");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(getName()+"adamantium pençelerini oyuncuya bildirir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+"adamantium pençelerini oyuncuya bildirir.");
    }
}

