package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first = (first & second) + (first | second);
        second = first + (~second) + 1;
        first = first + (~second) + 1;

    }
}
