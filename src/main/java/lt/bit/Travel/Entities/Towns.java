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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="town")
public class Towns {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	@NotEmpty
	@Size(min=3, max=20)
	private String title;
	
	@Column
	@Size(max=11)
	private Integer populiation;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Countries country;
	
	@Column
	private Timestamp created_at;
	
	@Column
	private Timestamp updated_at;


	public Towns() {
		
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


	public Integer getPopuliation() {
		return populiation;
	}


	public void setPopuliation(Integer populiation) {
		this.populiation = populiation;
	}


	public Countries getCountry() {
		return country;
	}


	public void setCountry(Countries country) {
		this.country = country;
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
	
	




	public Towns(@NotEmpty @Size(min = 3, max = 20) String title, @Size(max = 11) Integer populiation,
			Countries country, Timestamp created_at, Timestamp updated_at) {
		super();
		this.title = title;
		this.populiation = populiation;
		this.country = country;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	

	
	
	
}
