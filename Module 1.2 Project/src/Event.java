public class Event implements Comparable<Event>{
    int time;
    String type;

    public Event(int time, String type) {
        this.time = time;
        this.type = type;
    }



    @Override
    public int compareTo(Event other) {
        return (int) (this.time - other.time);
    }

    @Override
    public String toString(){
        return "Time : (" + time + "), Event : (" + this.type + ")";
    }
}
