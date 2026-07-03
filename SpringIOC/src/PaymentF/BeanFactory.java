package PaymentF;
import java.lang.reflect.Method;
import java.util.Properties;

public class BeanFactory {
    private static Properties pros;
    static {
        pros = new Properties();
        try {
            pros.load(BeanFactory.class.getClassLoader().getResourceAsStream("app2.Properties"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Object getBean(String beanName) throws Exception {

        String targetClassName = pros.getProperty(beanName);
        Class<?> clazz = Class.forName(targetClassName);
        Object targetObject = clazz.getDeclaredConstructors()[0].newInstance();

        String dependentBeanName = beanName + ".payment";
        String dependentBeanClassName = pros.getProperty(dependentBeanName);
        Class<?> dependentBeanClass = Class.forName(dependentBeanClassName);
        Object dependentBeanObject = dependentBeanClass.getDeclaredConstructors()[0].newInstance();

        Method[] methods = targetObject.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("set")
                    && method.getParameters().length == 1
                    && method.getParameterTypes()[0].isAssignableFrom(dependentBeanClass)) {
                method.invoke(targetObject, dependentBeanObject);
                break;
            }
        }
        return targetObject;
    }
}


