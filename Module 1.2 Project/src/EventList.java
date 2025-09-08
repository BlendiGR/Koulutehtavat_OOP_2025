import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> pq = new PriorityQueue<>();

    public void add(Event e) {
        pq.add(e);
    }

    public Event getNext() {
        return pq.poll();  // removes and returns earliest event
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public void printAll() {
        PriorityQueue<Event> copy = new PriorityQueue<>(pq);
        while (!copy.isEmpty()) {
            System.out.print(copy.poll() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        EventList el = new EventList();

        el.add(new Event(15, EventType.ARRIVAL));
        el.add(new Event(10, EventType.EXIT));
        el.add(new Event(20, EventType.SERVICEDONE));

        System.out.println("Next event: " + el.getNext());

        System.out.print("Remaining: ");
        el.printAll();
    }
}
