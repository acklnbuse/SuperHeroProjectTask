
public class Batman extends SuperHeroes{
private String detectiveSkillsAbility;
    public Batman(String name, String gender, String aggression, String wisdom, String beauty,String detectiveSkillsAbility) {
        super(name, gender, aggression, wisdom, beauty);
        this.detectiveSkillsAbility=detectiveSkillsAbility;
    }

    public String getDetectiveSkillsAbility() {
        return detectiveSkillsAbility;
    }

    public void setDetectiveSkillsAbility(String detectiveSkillsAbility) {
        this.detectiveSkillsAbility = detectiveSkillsAbility;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(detectiveSkillsAbility+"detectiveSkillsAbility");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(getName()+"dedektif yeteneklerini oyuncuya bildirir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+"dedektif yeteneklerini oyuncuya bildirir.");
    }
}
