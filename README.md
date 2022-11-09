# springdoc-native

This is a simple project to demonstrate java.lang.NullPointerException thrown when creating bean with name 'modelConverterRegistrar'.

## Environment 

GraalVM version : graalvm-ce-java17-22.3.0
JDK version: openjdk version "17.0.5"
Architecture: AMD64

## Compile
```
./gradlew nativeCompile
```

## Run
```
./build/native/nativeCompile/springdoc-native
```

## Fails with

```
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'modelConverterRegistrar': Unexpected exception during bean creation; nested exception is java.lang.NullPointerException
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:555) ~[springdoc-native:0.12.1]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[springdoc-native:0.12.1]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[springdoc-native:0.12.1]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[springdoc-native:0.12.1]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[springdoc-native:0.12.1]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:955) ~[springdoc-native:0.12.1]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:918) ~[springdoc-native:5.3.23]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[springdoc-native:5.3.23]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147) ~[na:na]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[springdoc-native:2.7.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408) ~[springdoc-native:2.7.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:308) ~[springdoc-native:2.7.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[springdoc-native:2.7.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[springdoc-native:2.7.5]
        at com.example.springdocnative.Application.main(Application.java:14) ~[springdoc-native:na]
Caused by: java.lang.NullPointerException: null
        at org.springdoc.core.converters.ModelConverterRegistrar.getRegisteredConverterSameAs(ModelConverterRegistrar.java:74) ~[springdoc-native:1.6.12]
        at org.springdoc.core.converters.ModelConverterRegistrar.<init>(ModelConverterRegistrar.java:58) ~[springdoc-native:1.6.12]
        at org.springdoc.core.SpringDocConfiguration.modelConverterRegistrar(SpringDocConfiguration.java:260) ~[springdoc-native:1.6.12]
        at org.springdoc.core.ContextBootstrapInitializer.lambda$registerSpringDocConfiguration_modelConverterRegistrar$18(ContextBootstrapInitializer.java:96) ~[na:na]
        at org.springframework.aot.beans.factory.BeanDefinitionRegistrar$ThrowableFunction.apply(BeanDefinitionRegistrar.java:294) ~[springdoc-native:0.12.1]
        at org.springframework.aot.beans.factory.InjectedElementResolver.create(InjectedElementResolver.java:67) ~[springdoc-native:0.12.1]
        at org.springframework.aot.beans.factory.BeanDefinitionRegistrar$BeanInstanceContext.create(BeanDefinitionRegistrar.java:211) ~[na:na]
        at org.springdoc.core.ContextBootstrapInitializer.lambda$registerSpringDocConfiguration_modelConverterRegistrar$19(ContextBootstrapInitializer.java:96) ~[na:na]
        at org.springframework.aot.beans.factory.BeanDefinitionRegistrar$ThrowableFunction.apply(BeanDefinitionRegistrar.java:294) ~[springdoc-native:0.12.1]
        at org.springframework.aot.beans.factory.BeanDefinitionRegistrar.lambda$instanceSupplier$0(BeanDefinitionRegistrar.java:115) ~[na:na]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1249) ~[springdoc-native:0.12.1]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1191) ~[springdoc-native:0.12.1]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[springdoc-native:0.12.1]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[springdoc-native:0.12.1]
        ... 14 common frames omitted
```
