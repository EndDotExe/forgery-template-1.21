package net.end.forgery;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import java.lang.reflect.Method;

public class MethodInspector implements ModInitializer {

    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            inspectMethods();
        });
    }

    private static void inspectMethods() {
        try {
            Class<?> clazz = Class.forName("com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes");
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}