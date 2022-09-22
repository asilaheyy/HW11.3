public class Main {
    // 3.
    public static void delivery(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 ");
        }
    }
    public static void main(String[] args) {
        int deliveryDistance = 95;
        delivery(deliveryDistance);

    }

}