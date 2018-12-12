package learning.designpatterns.creational.singleton;

class Singleton {

    private Singleton() {
    }

    static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}
