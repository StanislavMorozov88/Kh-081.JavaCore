package threads15;

class Run1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Appl.sum--;
        }
    }
}

class Run2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Appl.sum++;
        }
    }
}