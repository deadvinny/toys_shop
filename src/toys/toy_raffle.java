package toys;

import java.util.PriorityQueue;

public class toy_raffle {
    private final String[] toyIds;       // Массив идентификаторов игрушек
    private final String[] toyNames;     // Массив названий игрушек
    private final int[] toyWeights;      // Массив весов (частоты выпадения) игрушек
    private final PriorityQueue<String> raffleQueue; // Очередь с игрушками для розыгрыша


    public toy_raffle(String[] toyIds, String[] toyNames, int[] toyWeights) {
        this.toyIds = toyIds;
        this.toyNames = toyNames;
        this.toyWeights = toyWeights;
        this.raffleQueue = new PriorityQueue<>();


        for (int i = 0; i < toyIds.length; i++) {
            int weight = toyWeights[i];
            for (int j = 0; j < weight; j++) {
                raffleQueue.add(toyIds[i]);
            }
        }
    }


    public String drawToy() {
        if (raffleQueue.isEmpty()) {
            return "Розыгрыш завершен. Все игрушки разыграны.";
        }
        return raffleQueue.poll();
    }

}
