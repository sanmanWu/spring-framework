package com.wujs.spring.testimport;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author WuJS
 * @date 2021/6/22
 * @desc
 */
public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		final RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Cat.class);
		registry.registerBeanDefinition("波斯猫", rootBeanDefinition);
	}
}
