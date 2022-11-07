package kodlama.io.Kodlama.io.Devs.business.requests.technology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTechnologyRequest {
	
	private String name;
	private int languageId;
}
