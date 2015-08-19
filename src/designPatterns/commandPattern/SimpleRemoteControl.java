package commandPattern;

public class SimpleRemoteControl {

    private StartCommand src;

    public void setCommand(StartCommand ceilingFanCommad) {
        this.src = ceilingFanCommad;
    }

    public void pressButton() {
        src.start();
    }

}
