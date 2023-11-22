package com.raihan.concurrency.basic.callable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

public class FactorialTaskTest {
    private ExecutorService executorService;

    @Before
    public void setup() {
        executorService = Executors.newSingleThreadExecutor();
    }

    @Test
    public void basicTest() throws ExecutionException, InterruptedException {
        FactorialTask task = new FactorialTask(5);
        Future<Integer> future = executorService.submit(task);
        assertEquals(120, future.get().intValue());
    }

    @Test(expected = ExecutionException.class)
    public void throwsException() throws ExecutionException, InterruptedException {
        FactorialTask task = new FactorialTask(-5);
        Future<Integer> future = executorService.submit(task);
        Integer result = future.get().intValue();
    }

    @Test
    public void doesNotThrow() {
        FactorialTask task = new FactorialTask(-5);
        Future<Integer> future = executorService.submit(task);
        assertFalse(future.isDone());
    }

    @After
    public void cleanup(){
        executorService.shutdown();
    }
}
