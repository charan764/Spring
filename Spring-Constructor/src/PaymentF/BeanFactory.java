package PaymentF;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class BeanFactory {
    private static Properties pros;
    static {
        pros = new Properties();
        try {
            pros.load(BeanFactory.class.getClassLoader().getResourceAsStream("app3.Properties"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Object getBean(String beanName) throws Exception {

        String targetClassName = pros.getProperty(beanName);
        Class<?> targetclazz= Class.forName(targetClassName);


        String dependentBeanName = beanName + ".payment";
        String dependentBeanClassName = pros.getProperty(dependentBeanName);
        Class<?> dependentBeanClass = Class.forName(dependentBeanClassName);
        Object dependentBeanObject = dependentBeanClass.getDeclaredConstructors()[0].newInstance();

        Constructor<?> constructor = targetclazz.getConstructor(dependentBeanClass.getInterfaces()[0]);
        return constructor.newInstance(dependentBeanObject);
    }
}


