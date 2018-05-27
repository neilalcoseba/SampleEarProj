package ejbs.session.bid;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejbs.dao.Bid;

@Stateless(name = "PlaceBid")
public class PlaceBidBean implements PlaceBid {
	@PersistenceContext(unitName = "actionBazaar")
	private EntityManager em;

	public Bid addBid(Bid bid) {
		return null;
	}
}
