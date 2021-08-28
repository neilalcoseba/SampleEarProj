package ejbs.session.bid;

import ejbs.dao.Bid;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;

@Stateless
@LocalBean
public class PlaceBidBean implements PlaceBid {
	@PersistenceContext(unitName = "customerPersistenceUnit")
	private EntityManager entityManager;

	public Bid addBid(Bid bid) {
		if (bid.getDate() == null) {
			bid.setDate(new Date());
		}

		entityManager.persist(bid);
		return bid;
	}

	@Override
	public String getMessage() {
		return "TEST";
	}
}
