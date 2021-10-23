public class BeverageMakerTest {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        System.out.println("Preparing a cup of coffee...");
        coffee.prepareRecipe();

        System.out.println("Preparing a cup of tea...");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
