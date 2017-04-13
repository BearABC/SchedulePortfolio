package scheduleshare.domain.model.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class UserForm implements Serializable {

	@Getter
	@Setter
	@NotNull
	@Size(min = 1, max = 20)
	private String consumerId;

	@Getter
	@Setter
	@NotNull
	@Size(min = 1, max = 20)
	private String consumerName;

	@Getter
	@Setter
	@NotNull
	@Size(min = 6, max = 12)
	private String password;
}
