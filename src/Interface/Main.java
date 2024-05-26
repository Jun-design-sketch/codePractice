package Interface;

public class Main {
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.perform(1,2));
        Subtract subtract = new Subtract();
        System.out.println(subtract.perform(1,2));
        Divide divide = new Divide();
        System.out.println(divide.perform(1,0));
        System.out.println(divide.perform(6,2));
    }
}

interface Operation {
    int perform(int x, int y);
}

class Add implements Operation {
    @Override
    public int perform(int x, int y) {
        return x+y;
    }
}

class Subtract implements Operation {
    @Override
    public int perform(int x, int y) {
        return x-y;
    }
}

class Divide implements Operation {
    @Override
    public int perform(int x, int y) {
        return y == 0 ? -1 : x/y;
    }
}
