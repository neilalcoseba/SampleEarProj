package ejbs.session.bid;

import ejbs.dao.Bid;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class PlaceBidBean implements PlaceBid {
	public Bid addBid(Bid bid) {
		return null;
	}

	@Override
	public String getMessage() {
		return "TEST";
	}
}
