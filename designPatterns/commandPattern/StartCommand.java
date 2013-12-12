package commandPattern;

public class StartCommand {
    private CeilingFan fan;

    public StartCommand(CeilingFan cFan) {
        // TODO Auto-generated constructor stub
        this.fan = cFan;
    }

    public void start() {
        this.fan.startFan();
    }

    public void stop() {
        this.fan.stopFan();
    }
}
