package com.qakj.crm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class UploadFileConfig {
	@Bean //将组件注册在容器
	public WebMvcConfigurer webMvcConfigurerAdapter(){
	   		WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {
	   			@Override
	   	        public void addResourceHandlers(ResourceHandlerRegistry registry) {
	   	                /**
	   	                 * 资源映射路径
	   	                 * addResourceHandler：访问映射路径
	   	                 * addResourceLocations：资源绝对路径
	   	                 */
	   	        	 registry.addResourceHandler("/img/**").addResourceLocations("file:C:/uploads/");
	   	        }
	        };
	        return webMvcConfigurer;
	    }
}
