package learning.designpatterns.creational;

class Singleton {

    private Singleton() {
    }

    static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    private static class SingletonFactory {
        private static final Singleton instance = new Singleton();
    }
}
