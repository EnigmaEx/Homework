public class Main {

    public static void main (String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Evgeniy Kunko", "Manager", "evgikunko@gmail.com", "+79056789753", 400, 27);
        employees[1] = new Employee("Astik Baum", "Pro Manager", "Asti69@gmail.com", "+79834579602", 650, 32);
        employees[2] = new Employee("Nugella San", "Designer", "NugaSan.com", "+78767456547", 600, 24);
        employees[3] = new Employee("Yuri Humster", "Engineer", "Humstik@gmail.com", "+79074902344", 800, 35);
        employees[4] = new Employee("Alesta Kreemwood", "Director", "Kreemwood@gmail.com", "+79044503379", 1200, 42);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }

        Park park = new Park();

        Park.Attraction[] attractions = new Park.Attraction[5];
        attractions[0] = park.new Attraction("Swing Rides", "10:00 AM", "08:00 PM", 1.99);
        attractions[1] = park.new Attraction("Train Rides", "11:00 AM", "07:00 PM", 3.99);
        attractions[2] = park.new Attraction("Frisbee Ride", "10:00 AM", "08:00 PM", 1.69);
        attractions[3] = park.new Attraction("Kiddie Rides", "10:00 AM", "08:00 PM", 0.99);
        attractions[4] = park.new Attraction("Paratrooper", "11:00 AM", "06:00 PM", 2.49);

        for (Park.Attraction attraction : attractions) {
            attraction.printInfo();
            System.out.println();
        }
    }
}