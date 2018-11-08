package pl.techstyle.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="SzczegolyPost")
@Entity
@Data
@NoArgsConstructor
public class DetailPost implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7102020699486896671L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="Stworzone_przez")
	private String createdBy;
	
	@Column(name="Data_utworzenia")
	private Date data;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_post")
	private Post post;
	
	
}
