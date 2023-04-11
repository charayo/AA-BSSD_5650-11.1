public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
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