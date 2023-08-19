import org.example.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * projectName:PACKAGE_NAME
 *
 * @author: 胡刚
 * time:2023/8/8 23:28
 * description:
 */
public class C {

    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException {
        ApplicationContext iocContainerAnnotation = new ClassPathXmlApplicationContext("spring-bean.xml");
        Teacher teacher = iocContainerAnnotation.getBean(Teacher.class);
        System.out.println(teacher.getName());
    }

}
