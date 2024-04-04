package main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system.auctions;

public class ReserveAuction extends Auction {
    private int reservePrice;

    public ReserveAuction(String item, int reservePrice) {
        super(item);
        this.reservePrice = reservePrice;
    }
}