public class BeverageMakerTest {
    public static void main(String[] args) {
        CaffeineBeverageWithHook coffee = new Coffee();
        System.out.println("Preparing a cup of coffee...");
        coffee.prepareRecipe();

        System.out.println("Preparing a cup of tea...");
        CaffeineBeverageWithHook tea = new Tea();
        tea.prepareRecipe();
    }
}
