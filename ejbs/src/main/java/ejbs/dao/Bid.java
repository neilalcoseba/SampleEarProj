package ejbs.dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BIDS")
public class Bid {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BID_ID")
	private Long id;

	@Column(name = "BID_DATE")
	private Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
