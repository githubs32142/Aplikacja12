package pl.techstyle.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Post")
@Data
@NoArgsConstructor
public class Post implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2813620947370327761L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_post")
	long id;
	
	@Column(name="tytul")
	String title;
	
	@OneToOne(mappedBy="post")
	DetailPost detail;
	
}
