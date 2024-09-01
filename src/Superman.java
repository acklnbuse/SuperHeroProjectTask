

public class Superman extends SuperHeroes{
    private String flyingAbility;
    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...
    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String flyingAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setFlyingAbility(flyingAbility);

    }

    public String getFlyingAbility() {
        return flyingAbility;
    }

    public void setFlyingAbility(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(flyingAbility+ "flyingAbility");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(getName()+"uçma yeteneğini oyuncuya bildirir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+"uçma yeteneğini oyuncuya bildirir.");
    }
}
