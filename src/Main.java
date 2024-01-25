
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Apple amazApple = new Apple("red", "large");

        Apple bretzApple = new Apple("purple","Medium");

        Apple mrkApple = new Apple();

        System.out.println(amazApple);

        System.out.println(bretzApple);
        mrkApple.setColor("Pink");
        mrkApple.setSize("Medium");

        System.out.println(mrkApple);

    }
}