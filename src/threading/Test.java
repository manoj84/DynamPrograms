package threading;

public class Test {

    public static void main(String args[]) {

        Test test = new Test();
        System.out.println(test.canAccessStatic());

    }

    public Test() {

    }

    public static boolean canAccessStatic() {
        return true;

    }

    public boolean canAccessInstance() {
        return true;
    }

}
