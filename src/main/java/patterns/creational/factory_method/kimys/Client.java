package patterns.creational.factory_method.kimys;

public class Client {

    public static void main(String[] args) {
//        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "kimys@mail.com");
//        System.out.println(whiteship);
//
//        Ship blackship = new BlackShipFactory().orderShip("Blackship", "kimys@mail.com");
//        System.out.println(blackship);

        // 클라이언트 부분도 인터페이스 기반으로 변경
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "kimys@mail.com");
        client.print(new BlackShipFactory(), "blackship", "kimys@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
