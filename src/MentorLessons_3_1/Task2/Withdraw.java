package MentorLessons_3_1.Task2;

public class Withdraw extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " kartdan pul cixarir...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " pul cixardi ve novbeni bosaltdi.");
    }

    class Withdraw2 extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " kartdan pul cixarir...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " pul cixardi ve novbeni bosaltdi.");
        }

        class Withdraw3 extends Thread {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " kartdan pul cixarir...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " pul cixardi ve novbeni bosaltdi.");
            }
        }
    }
}
