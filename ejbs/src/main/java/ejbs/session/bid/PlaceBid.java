package ejbs.session.bid;

import javax.ejb.Remote;

import ejbs.dao.Bid;

@Remote
public interface PlaceBid {
	Bid addBid(Bid bid);
}
