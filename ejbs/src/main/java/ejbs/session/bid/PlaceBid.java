package ejbs.session.bid;

import javax.ejb.Local;
import javax.ejb.Remote;

import ejbs.dao.Bid;

@Remote
@Local
public interface PlaceBid {
	Bid addBid(Bid bid);

	String getMessage();
}
