package be.jonasboon.exceltofinancefile.model;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumberArray {
    boolean hasRun = false;
    int[] resultArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public RandomNumberArray() {
    }

    public int[] run(int amountOfIterations){
        if(!hasRun)
            return getRandomNumberArray(amountOfIterations);
        throw new RuntimeException("There is already a test result");
    }

    public void printArray() {
        IntStream.range(0, resultArray.length)
                .forEach(index -> System.out.println(index + " = " + resultArray[index]));
    }

    private int[] getRandomNumberArray(int amountOfIterations) {
        for (int i = 0; i < amountOfIterations; i++) {
            Integer randomNumber = getRandomNumber();
            resultArray[randomNumber]++;
        }
        return resultArray;
    }

    private Integer getRandomNumber(){
        return new Random().nextInt(10);
    }
}
