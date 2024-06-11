package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
        }
        double result = (double) dividend / divider;
        double check = result * divider;
        String finalResult = check == divider ? "can be divided completely" : "cannot be divided completely";
        System.out.println(finalResult);
    }
}
