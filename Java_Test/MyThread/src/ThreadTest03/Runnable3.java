package ThreadTest03;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Runnable3 implements Runnable {
    private static final int TOTAL_MONEY = 100;
    private static final int RED_PACKET_COUNT = 3;
    private static final Object lock = new Object();
    private static List<Double> redPackets;
    private static boolean packetsGenerated = false;

    @Override
    public void run() {
        synchronized (lock) {
            if (!packetsGenerated) {
                redPackets = generateRedPackets(TOTAL_MONEY, RED_PACKET_COUNT);
                packetsGenerated = true;
            }
        }

        try {
            // 模拟抢红包的过程
            double amount = grabRedPacket();
            if (amount > 0) {
                System.out.println(Thread.currentThread().getName() + " 抢到了红包: " + amount);
            } else {
                System.out.println(Thread.currentThread().getName() + " 没有抢到红包");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("线程被中断: " + Thread.currentThread().getName());
        }
    }

    private static List<Double> generateRedPackets(int totalMoney, int count) {
        List<Double> packets = new ArrayList<>();
        double remainingMoney = totalMoney;
        for (int i = 0; i < count - 1; i++) {
            double randomAmount = ThreadLocalRandom.current().nextDouble(0.01, remainingMoney - (count - i - 1) * 0.01);
            packets.add(randomAmount);
            remainingMoney -= randomAmount;
        }
        packets.add(remainingMoney);
        return packets;
    }

    private double grabRedPacket() throws InterruptedException {
        synchronized (lock) {
            if (redPackets.isEmpty()) {
                return 0;
            }
            int index = ThreadLocalRandom.current().nextInt(0, redPackets.size());
            double amount = redPackets.remove(index);
            return amount;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable3(), "Thread-" + (i + 1));
            thread.start();
        }
    }
}
