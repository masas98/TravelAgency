package lt.bit.Travel.Entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
@Table(name="customer")
public class Customers {

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column
		@NotEmpty
		@Size(min=3, max=20)
		private String name;
		
		
		@Column
		@NotEmpty
		@Size(min=3, max=25)
		private String surname;
		
		@Column
		@Size(max=40)
		@Email(message = "Įveskite teisingą el.pašto adresą!")
		private String email;
		
		@Column
		@Size(max=15)
		private String phone;
		
		@ManyToOne
		@JoinColumn(name="country_id")
		private Countries country;
		
		@Column
		private Timestamp created_at;
		
		@Column
		private Timestamp updated_at;
		

		
		public Customers() {
			
		}


		
		
		

		
		
		

}
