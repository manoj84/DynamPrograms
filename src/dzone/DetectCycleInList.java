package dzone;

public class DetectCycleInList {

    public static void main(String args[]) {

        CustomNode headCustomNode = new CustomNode("start");
        CustomNode first = new CustomNode("first");
        headCustomNode.setNode(first);
        CustomNode second = new CustomNode("second");
        first.setNode(second);
        CustomNode third = new CustomNode("third");
        second.setNode(third);
        CustomNode fourth = new CustomNode("fourth");
        third.setNode(fourth);

        CustomNode loopNode = new CustomNode("Loop");
        fourth.setNode(loopNode);

        loopNode.setNode(third);

        // This is using fast runner slow runner
        checkCycle(headCustomNode);

    }

    private static void checkCycle(CustomNode headCustomNode) {

        // Fast Runner slow Runner

        CustomNode fastRunnerCustomNode = headCustomNode;
        CustomNode slowRunnerCustomNode = headCustomNode;
        boolean print = true;

        while (fastRunnerCustomNode.hasNext()) {
            fastRunnerCustomNode = fastRunnerCustomNode.getNext();

            if (fastRunnerCustomNode.getValue().equals(
                    slowRunnerCustomNode.getValue())) {
                System.out.println("This is cyclic loop , and point is "
                        + fastRunnerCustomNode.getValue());
                print = false;
                break;
            }

            else {
                fastRunnerCustomNode = fastRunnerCustomNode.getNext();
                slowRunnerCustomNode = slowRunnerCustomNode.getNext();
            }
        }
        if (print)
            System.out.println("No cyclic loop");

        slowRunnerCustomNode = headCustomNode;

        while (!(slowRunnerCustomNode.getValue().equals(fastRunnerCustomNode
                .getValue()))) {
            slowRunnerCustomNode = slowRunnerCustomNode.getNext();
            fastRunnerCustomNode = fastRunnerCustomNode.getNext();

        }

        System.out.println("Starting point is "
                + slowRunnerCustomNode.getValue());
    }
}
