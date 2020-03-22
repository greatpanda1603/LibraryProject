package entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long user_id;

	@Column(name = "USER_NAME", nullable = false, length = 100)
	private String userName;

	@Column(name = "USER_AGE", nullable = false, columnDefinition = "int")
	private int userAge;

	@Column(name = "REGISTRATION_DATE", nullable = false)
	private LocalDate registrationDate;

	@Column(name = "TERMINATION_DATE")
	private LocalDate terminationDate;
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Usage> usages;

}
