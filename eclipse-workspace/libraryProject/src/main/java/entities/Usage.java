package entities;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LIBRARY_USAGE")
public class Usage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USAGE_ID")
	private Long usage_id;

	@Column(name = "TAKE_DATE", nullable = false)
	private LocalDate takeDate;

	@Column(name = "RETURN_DATE")
	private LocalDate returnDate;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinTable(name = "USER_USAGE", joinColumns = @JoinColumn(name = "USAGE_ID"), inverseJoinColumns = @JoinColumn(name = "USER_ID"))
	private User user;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinTable(name = "BOOK_EXAMPLE_USAGE", joinColumns = @JoinColumn(name = "USAGE_ID"), inverseJoinColumns = @JoinColumn(name = "BOOK_EXAMPLE_ID"))
	private BookExample bookExample;

}
