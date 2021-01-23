package com.codecool.threads.advanced.lessons.executorservice.euler;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.concurrent.*;

public class App {

    private final static int LASTITER = 20;

    public static void main(String[] args) {
        Callable<BigDecimal> callable = getEulerCalcCallable();
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<BigDecimal> maybeEuler = executor.submit(callable);

        try {
            while (!maybeEuler.isDone()) {
                System.out.println("waiting");
            }
            System.out.println(maybeEuler.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Exception being thrown");
        }

        executor.shutdownNow();
    }

    private static Callable<BigDecimal> getEulerCalcCallable() {
        return new Callable<BigDecimal>() {
            @Override
            public BigDecimal call() {
                MathContext mc =
                        new MathContext(100, RoundingMode.HALF_UP);
                BigDecimal result = BigDecimal.ZERO;
                for (int i = 0; i <= LASTITER; i++) {
                    BigDecimal factorial =
                            factorial(new BigDecimal(i));
                    BigDecimal res = BigDecimal.ONE.divide(factorial,
                            mc);
                    result = result.add(res);
                }
                return result;
            }

            public BigDecimal factorial(BigDecimal n) {
                if (n.equals(BigDecimal.ZERO))
                    return BigDecimal.ONE;
                else
                    return n.multiply(factorial(n.
                            subtract(BigDecimal.ONE)));
            }
        };
    }

}
