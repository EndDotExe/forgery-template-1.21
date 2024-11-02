
    import java.lang.reflect.Method;

    public class MethodInspector {
        public static void main(String[] args) {
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

