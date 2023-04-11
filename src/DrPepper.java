public class DrPepper extends CaffeineBeverage{

    @Override
    void boil() {
        System.out.println("Boiling Dr. Pepper");
    }

    @Override
    void brew() {
        //brew nothing
    }

    @Override
    boolean wantsLemon() {
        return false;
    }

    @Override
    boolean wantsMilk() {
        return false;
    }

    @Override
    boolean wantsSugar() {
        return false;
    }
}
