package com.kang.myspring.main;
import com.kang.myspring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import java.io.IOException;
/**
 * User:
 * Description: 展示spring资源管理器
 * Date: 2022-08-15
 * Time: 22:40
 */
public class SpringResourceMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Resource resource = context.getResource
                ("file://D:\\idea4restart\\mySpring\\mySpring-classC-coreClazz\\src\\main\\java\\com\\kang\\myspring\\main\\SpringResourceMain.java");
        try {
            System.out.println(""+resource.contentLength());
            System.out.println(resource.getFilename());

            Resource resource1 = context.getResource("https://www.baidu.com");
            System.out.println(resource1.contentLength());
            System.out.println(resource1.getURL());

            Resource resource2 = context.getResource("classpath:simple.txt");
            System.out.println(resource2.contentLength());
            System.out.println(resource2.getURL());

            // 批量加载class
            Resource[] resources = context.getResources("classpath:com/kang/myspring/main/*.class");
            for (Resource resource3 : resources) {
                System.out.println(resource3.contentLength());
                System.out.println(resource3.getFilename());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
