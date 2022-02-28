package lt.bit.Travel.Entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity
@Table(name="country")
public class Countries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	@NotEmpty
	@Size(min=3, max=20)
	private String title;
	
	
	@Column
	@NotEmpty
	private String description;
	
	@Column
	private Integer distance;
	
	
	@Column
	private Timestamp created_at;
	
	@Column
	private Timestamp updated_at;
	
	@OneToMany(mappedBy = "country")
	private List<Customers> customers;
	
	@OneToMany(mappedBy = "country")
	private List<Towns> towns;
	
	public Countries() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}

	public List<Towns> getTowns() {
		return towns;
	}

	public void setTowns(List<Towns> towns) {
		this.towns = towns;
	}

	public Countries(@NotEmpty @Size(min = 3, max = 20) String title, @NotEmpty String description,
			@Size(max = 40) Integer distance, Timestamp created_at, Timestamp updated_at, List<Customers> customers,
			List<Towns> towns) {
		super();
		this.title = title;
		this.description = description;
		this.distance = distance;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.customers = customers;
		this.towns = towns;
	}


	 
	
	
}
