class SingletonEager{
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}

class SingletonSynchronizedMethod{
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod(){};

    public static synchronized SingletonSynchronizedMethod getInstance(){
        if(instance == null)
            instance = new SingletonSynchronizedMethod();
        return instance;
    }
}

class SingletonSynchronizedBlock{
    private static SingletonSynchronizedBlock instance;

    private SingletonSynchronizedBlock(){}

    public static SingletonSynchronizedBlock getInstance(){
        if(instance == null){
            synchronized (SingletonSynchronizedBlock.class){
                if(instance == null)
                    instance = new SingletonSynchronizedBlock();
            }
        }
        return instance;
    }
}

public class SingletonPatternExample {
    public static void main(String[] args){
        SingletonSynchronizedBlock instance = SingletonSynchronizedBlock.getInstance();
        System.out.println(instance);

        SingletonSynchronizedBlock instance1 = SingletonSynchronizedBlock.getInstance();
        System.out.println(instance1);
    }
}
