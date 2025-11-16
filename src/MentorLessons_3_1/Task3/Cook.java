package MentorLessons_3_1.Task3;

public class Cook extends  Thread{
    private  Knife a;

    public Cook(Knife a) {
        this.a = a;
    }

    @Override
    public  void run() {
        synchronized(a){
        System.out.println(Thread.currentThread().getName() +  " bicagi goturdu ve terevez dograyir...");
        System.out.println(a.getCutting());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " bicagi buraxdi.");
    }}
}
