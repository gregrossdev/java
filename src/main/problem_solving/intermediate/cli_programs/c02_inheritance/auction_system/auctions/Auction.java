package main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system.auctions;

import main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system.pojo.Bid;

public class Auction {
    private String item;
    private String highestBidder;
    private int highestBid;

    public Auction(String item) {
        this.item = item;
        this.highestBidder = "";
        this.highestBid = 0;
    }

    public void placeBid(Bid bid) {
        System.out.println("Bid placed on " + item + " by " + bid.getBidder() + " for $" + bid.getAmount());
        if (bid.getAmount() > highestBid) {
            highestBid = bid.getAmount();
            highestBidder = bid.getBidder();
        }
    }

    public String getHighestBidder() {
        return highestBidder;
    }
}
