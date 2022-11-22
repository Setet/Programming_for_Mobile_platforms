class EggVoice extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);        //Приостанавливает поток на 1 секунду
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Боба : " + i);
        }
    }
}

public class Main {
    static EggVoice mAnotherOpinion;    //Побочный поток

    public static void main(String[] args) {
        mAnotherOpinion = new EggVoice();    //Создание потока
        System.out.println("Счёт начали...");
        mAnotherOpinion.start();            //Запуск потока

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);        //Приостанавливает поток на 1 секунду
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Биба : " + i);
        }

        if (mAnotherOpinion.isAlive())    //Если оппонент еще не сказал последнее слово
        {
            try {
                mAnotherOpinion.join();    //Подождать пока оппонент закончит высказываться.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Боба выиграл!");
        } else    //если оппонент уже закончил высказываться
        {
            System.out.println("Биба выиграл!");
        }
        System.out.println("Счёт закончен!");
    }
}