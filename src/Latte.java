public class Latte extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Pulling espresso shot");
    }

    @Override
    void boil() {
        System.out.println("Boiling water");
    }

    @Override
    boolean wantsLemon() {
        return false;
    }
}
