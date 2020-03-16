import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
	private long id;
	private long author_id;
	private String name;
}
