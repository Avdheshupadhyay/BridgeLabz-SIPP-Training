import java.util.*;

// ===== Interface for all meal types =====
interface Meal {
    void displayMeal();
    boolean isValid();
}

// ===== Vegetarian Meal =====
class VegetarianMeal implements Meal {
    String name;
    boolean containsEggs;

    public VegetarianMeal(String name, boolean containsEggs) {
        this.name = name;
        this.containsEggs = containsEggs;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: " + name + (containsEggs ? " (with eggs)" : ""));
    }

    @Override
    public boolean isValid() {
        // Eggs are allowed in ovo-vegetarian but may be restricted otherwise
        return true;
    }
}

// ===== Vegan Meal =====
class VeganMeal implements Meal {
    String name;
    boolean containsDairy;

    public VeganMeal(String name, boolean containsDairy) {
        this.name = name;
        this.containsDairy = containsDairy;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: " + name + (containsDairy ? " (has dairy ❌)" : ""));
    }

    @Override
    public boolean isValid() {
        return !containsDairy;
    }
}

// ===== Keto Meal =====
class KetoMeal implements Meal {
    String name;
    int netCarbs;

    public KetoMeal(String name, int netCarbs) {
        this.name = name;
        this.netCarbs = netCarbs;
    }

    @Override
    public void displayMeal() {
        System.out.println("Keto Meal: " + name + " | Net Carbs: " + netCarbs + "g");
    }

    @Override
    public boolean isValid() {
        return netCarbs <= 25; // typical keto rule
    }
}

// ===== Utility class with generic methods =====
class MealPlanUtils {

    // Generic method to validate any meal
    public static <T extends Meal> void validateMealPlan(List<T> meals) {
        for (T meal : meals) {
            meal.displayMeal();
            System.out.println("Valid: " + (meal.isValid() ? "✅" : "❌"));
            System.out.println("---");
        }
    }

    // Method to generate a sample plan
    public static <T extends Meal> List<T> generateSamplePlan(T... meals) {
        return Arrays.asList(meals);
    }
}

// ===== Main class =====
public class MealPlanGenerator {
    public static void main(String[] args) {
        // Sample vegetarian meals
        List<VegetarianMeal> vegPlan = MealPlanUtils.generateSamplePlan(
            new VegetarianMeal("Paneer Curry", false),
            new VegetarianMeal("Egg Sandwich", true)
        );

        // Sample vegan meals
        List<VeganMeal> veganPlan = MealPlanUtils.generateSamplePlan(
            new VeganMeal("Tofu Stir Fry", false),
            new VeganMeal("Vegan Pizza", true)  // has dairy = invalid
        );

        // Sample keto meals
        List<KetoMeal> ketoPlan = MealPlanUtils.generateSamplePlan(
            new KetoMeal("Chicken Salad", 5),
            new KetoMeal("Fruit Bowl", 30)  // high carbs = invalid
        );

        // Validate all plans
        System.out.println("=== Vegetarian Meal Plan ===");
        MealPlanUtils.validateMealPlan(vegPlan);

        System.out.println("\n=== Vegan Meal Plan ===");
        MealPlanUtils.validateMealPlan(veganPlan);

        System.out.println("\n=== Keto Meal Plan ===");
        MealPlanUtils.validateMealPlan(ketoPlan);
    }
}
