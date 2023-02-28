package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
	
	@Id //PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id") 
	private int id;
	
	@Column(name="plate")
	private String plate;
	
	@Column(name="dailyPrice")
	private String dailyPrice;
	
	@Column(name="modelYear")
	private int modelYear;
	
	@Column(name="state")
	private int state; // 1- Available 2- Rented 3-Maintenance 

	@ManyToOne
	@JoinColumn(name="model_id")
	private Model model;
}
