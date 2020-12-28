package cn.gaosiy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StaticResourcesConfig implements WebMvcConfigurer{

	/**
     * 防止@EnableMvc把默认的静态资源路径覆盖了，手动设置的方式
     * 配置了静态资源访问
     * 还能配置视图解析 访问服务器上的资源
     * @param registry
     */
    @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 解决静态资源无法访问
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }        

    //配置服务器跨域请求被允许
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH")
                .allowCredentials(true).maxAge(3600);
    }
	
}
