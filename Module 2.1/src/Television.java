public class Television {

    private boolean on = false;
    private int channel = 0;

    public Television() {

    }
    public void pressOnOff(){
        on = !on;
    }

    public boolean isOn(){
        return on;
    }

    public void setChannel(int newChannel){
        if (channel < 10) {
            channel = newChannel;
        } else channel = 1;


    }
    public int getChannel(){
        return channel;
    }

}
