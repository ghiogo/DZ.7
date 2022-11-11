public class Medic extends Hero implements HavingSuperAbility {
    @Override
    public void applySuperAbility(String ability) {
        System.out.println("Medic вылечил Magic");
    }
}