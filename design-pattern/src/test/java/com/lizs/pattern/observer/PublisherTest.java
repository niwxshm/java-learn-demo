package com.lizs.pattern.observer;

        import org.junit.BeforeClass;
        import org.junit.Test;

        import java.lang.reflect.Method;

public class PublisherTest {
    @BeforeClass
    public static void before() throws NoSuchMethodException {
        Method method = AddObserver.class.getMethod("advice", Event.class);
        Callback callback = new Callback(new AddObserver(),method);
        EventListener.addListener(EventType.ADD,callback);

        method = RemoveObserver.class.getMethod("advice", Event.class);
        callback = new Callback(new RemoveObserver(),method);
        EventListener.addListener(EventType.REMOVE,callback);
    }

    @Test
    public void addTest() {
        Publisher publisher = new Publisher();
        publisher.add();
    }
    @Test
    public void removeTest() {
        Publisher publisher = new Publisher();
        publisher.remove();
    }
}
