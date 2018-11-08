package pl.techstyle.Model;




import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AllPost {
	
	private String title;
	private String createdBy;
	private Date data;

}
