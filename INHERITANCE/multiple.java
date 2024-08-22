interface A {
    public void run();
}

class b {
    public void run() {
        System.out.println("Run method of class b");
    }
}

class c extends b implements A {
    @Override
    public void run() {
        System.out.println("run method override in c class");
    }

    public void start() {
        super.run();
        System.out.println("Start method of class c");
    }
}

public class multiple {
    public static void main(String[] args) {
        c obj = new c();
        obj.run();
        obj.start();
    }
}
