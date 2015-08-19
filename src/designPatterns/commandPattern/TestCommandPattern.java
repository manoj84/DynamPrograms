package commandPattern;

public class TestCommandPattern {

    public static void main(String args[]) {
        CeilingFan cFan = new CeilingFan();
        StartCommand sCommand = new StartCommand(cFan);

        SimpleRemoteControl src = new SimpleRemoteControl();
        src.setCommand(sCommand);
        src.pressButton();

    }
}
