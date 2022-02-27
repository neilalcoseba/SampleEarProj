package ejbs.session.bid;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejbs.dao.Bid;

@Stateless(name = "PlaceBid")
@LocalBean
public class PlaceBidBean implements PlaceBid {
	@PersistenceContext(unitName = "sampleEARPersistenceUnit")
	private EntityManager em;

	public Bid addBid(Bid bid) {
		em.persist(bid);
		return bid;
	}
}
