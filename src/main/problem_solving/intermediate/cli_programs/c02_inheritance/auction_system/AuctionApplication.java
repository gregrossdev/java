package main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system;

import main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system.auctions.Auction;
import main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system.auctions.BuyoutAuction;
import main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system.auctions.ReserveAuction;
import main.problem_solving.intermediate.cli_programs.c02_inheritance.auction_system.pojo.Bid;

import java.util.Scanner;

public class AuctionApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("T-Shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));

        // Buyout Auction
        System.out.println("\nStarting a buyout auction for Backpack with a buyout price of $35");
        System.out.println("-----------------");

        BuyoutAuction buyoutAuction = new BuyoutAuction("Backpack", 35);
        buyoutAuction.placeBid(new Bid("Josh", 20));
        buyoutAuction.placeBid(new Bid("Fonz", 25));
        buyoutAuction.placeBid(new Bid("Rick Astley", 50));

        // Reserve Auction
        System.out.println("\nStarting a reserve auction for Laptop with a reserve price of $1250");
        System.out.println("-----------------");

        ReserveAuction reserveAuction = new ReserveAuction("Laptop", 1250);
        reserveAuction.placeBid(new Bid("Josh", 400));
        reserveAuction.placeBid(new Bid("Fonz", 2000));

        // Allow user to input bid price
        System.out.println("\nInput bid price for the general auction:");
        int userBidPrice = scanner.nextInt();
        generalAuction.placeBid(new Bid("User", userBidPrice));

        // Display the highest bidder for each auction
        System.out.println("\nGeneral auction highest bidder: " + generalAuction.getHighestBidder());
        System.out.println("Buyout auction highest bidder: " + buyoutAuction.getHighestBidder());
        System.out.println("Reserve auction highest bidder: " + reserveAuction.getHighestBidder());

        scanner.close();
    }
}
