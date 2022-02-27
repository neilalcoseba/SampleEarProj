package ejbs.session.bid;

import javax.ejb.Local;
import javax.ejb.Remote;

import ejbs.dao.Bid;

@Local
@Remote
public interface PlaceBid {
	Bid addBid(Bid bid);
}
