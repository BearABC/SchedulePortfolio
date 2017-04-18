package scheduleshare.config;

import javax.validation.Validator;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan("scheduleshare.domain.model.service")
public class BizConfig {

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource =
				new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/META-INF/messages");

		return messageSource;
	}

	@Bean
	public Validator globalValidator(MessageSource messageSource) {
		LocalValidatorFactoryBean validatorBean
			= new LocalValidatorFactoryBean();
		validatorBean.setValidationMessageSource(messageSource);

		return validatorBean;
	}
}