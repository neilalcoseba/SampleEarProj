package ejbs.session.bid;

import ejbs.dao.Bid;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "PlaceBid")
public class PlaceBidBean implements PlaceBid {
	@PersistenceContext(unitName = "postgresql")
	private EntityManager em;

	public Bid addBid(Bid bid) {
		return null;
	}
}
