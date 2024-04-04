package main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system.auctions;


public class BuyoutAuction extends Auction {
    private int buyoutPrice;

    public BuyoutAuction(String item, int buyoutPrice) {
        super(item);
        this.buyoutPrice = buyoutPrice;
    }
}
