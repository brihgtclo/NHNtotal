package ch3.exam02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelfRunnableCounterTest {
    @Test
    void testRun() throws InterruptedException {
        SelfRunnableCounter counter = new SelfRunnableCounter("TestThread", 5);

        // 테스트를 위한 스레드 상태 확인 플래그
        final boolean[] threadCompleted = {false};

        // Runnable을 재정의하여 테스트 완료 시점 확인
        Runnable completionNotifier = () -> {
            counter.run();
            threadCompleted[0] = true;
        };

        Thread testThread = new Thread(completionNotifier);
        testThread.start();

        // 테스트 스레드가 완료될 때까지 기다림
        testThread.join();

        // 스레드가 정상적으로 완료되었는지 확인
        assertTrue(threadCompleted[0]);
    }
}