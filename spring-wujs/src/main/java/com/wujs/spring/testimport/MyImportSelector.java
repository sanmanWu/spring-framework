package com.wujs.spring.testimport;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author WuJS
 * @date 2021/6/22
 * @desc
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.wujs.spring.testimport.Dog"};
	}
}
