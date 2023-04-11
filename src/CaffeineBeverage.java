public abstract class CaffeineBeverage {
    // Template Method
    final void prepareRecipe() {
        boil();
        brew();
        pourInCup();
        if(wantsLemon()){
            addLemon();
        }
        if(wantsMilk()){
            addMilk();
        }
        if(wantsSugar()){
            addSugar();
        }
        dispense();
    }
    //hooks
    boolean wantsLemon(){
        return true;
    }
    boolean wantsMilk(){
        return true;
    }

    boolean wantsSugar(){
        return true;
    }
    // edn hooks


    abstract void brew();
    abstract void boil();
    public void addLemon(){
        System.out.println("Adding Lemon");
    };
    public void addMilk(){
            System.out.println("Adding Milk");
        };
    public void addSugar(){
            System.out.println("Adding Sugar");
        };


    public void pourInCup() {
        System.out.println("Pouring into Cup");
    }
    public void dispense(){
        System.out.println("Robot are pushing cup through flap");
    }
}
