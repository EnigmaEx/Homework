public class Park {

    public class Attraction {

        private String name;
        private String openingTime;
        private String closingTime;
        private double price;

        public Attraction(String name, String openingTime, String closingTime, double price) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;

        }

        public void printInfo() {
            System.out.println("Name of Attraction: " + name);
            System.out.println("Opening Time: " + openingTime);
            System.out.println("Closing Time: " + closingTime);
            System.out.println("Price: $" + price);
        }
    }
}