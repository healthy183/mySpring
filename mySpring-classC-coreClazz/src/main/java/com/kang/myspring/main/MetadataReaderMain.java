package com.kang.myspring.main;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

/**
 * User:
 * Description: 在Spring中需要去解析类的信息，比如类名、类中的方法、类上的注解，这些都可以称之为类的元数据，
 * 所以Spring中对类的元数据做了抽象，并提供了一些工具类。
 * MetadataReader表示类的元数据读取器，默认实现类为SimpleMetadataReader
 * Date: 2022-08-19
 * Time: 23:49
 */
public class MetadataReaderMain {

    public static void main(String[] args) throws IOException {

        SimpleMetadataReaderFactory simpleMetadataReaderFactory = new SimpleMetadataReaderFactory();
        // 构造一个MetadataReader
        MetadataReader metadataReader = simpleMetadataReaderFactory.
                getMetadataReader("com.kang.myspring.service.DependServiceImpl");
        // 得到一个ClassMetadata，并获取了类名
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        System.out.println("类名:"+classMetadata.getClassName());
        // 获取一个AnnotationMetadata，并获取类上的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        for (String annotationType : annotationMetadata.getAnnotationTypes()) {
            System.out.println("注解:"+annotationType);
        }
    }
}
