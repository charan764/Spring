package PaymentF;
import java.util.Properties;
public class BeanFactory {
    private static Properties pros;
    static {
        pros = new Properties();
        try {
            pros.load(BeanFactory.class.getClassLoader().getResourceAsStream("app.Properties"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Object getBean(String beanName) throws Exception {
        String className = pros.getProperty(beanName);
        Class clazz = Class.forName(className);
        Object obj = clazz.getDeclaredConstructors()[0].newInstance();
        return obj;
    }
}

