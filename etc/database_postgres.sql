CREATE TABLE BIDS (
	BID_ID SERIAL PRIMARY KEY, 
	BID_PRICE INTEGER NULL, 
	BID_STATUS VARCHAR(255) NULL, 
	BID_DATE TIMESTAMP NULL, 
	BID_ITEM_ID INTEGER NULL, 
	BID_BIDDER VARCHAR(255) NULL
)