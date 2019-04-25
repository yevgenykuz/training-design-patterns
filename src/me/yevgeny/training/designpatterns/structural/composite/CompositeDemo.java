package me.yevgeny.training.designpatterns.structural.composite;

/**
 * @author Yevgeny Kuznetsov
 */
public class CompositeDemo {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");

        mainMenu.add(claimsSubMenu);

        MenuItem personalClaim = new MenuItem("Personal Claim", "/personalClaims");

        claimsSubMenu.add(personalClaim);

        System.out.println("Full tree:");
        System.out.println(mainMenu.toString());

        claimsSubMenu.remove(personalClaim);
        System.out.println("Personal Claim removed:");
        System.out.println(mainMenu.toString());
    }
}
