public static void main(String[] args) {
Car car1 = new LuxuryCar("BMW", "7 Series", "35ABC123");
car1 = new GPSDecorator(car1);
car1 = new LeatherSeatsDecorator(car1);

RentalRecord record1 = new RentalRecord(car1, 3, "John Doe");
record1.printInvoice();

System.out.println();

Car car2 = new EconomicCar("Toyota", "Yaris", "06XYZ987");
car2 = new HybridDecorator(car2);

RentalRecord record2 = new RentalRecord(car2, 5, "Jane Smith");
record2.printInvoice();

}