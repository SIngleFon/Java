public class main {
    public static void main(String[] args) {
            Elevator elevator = new Elevator(2);
            System.out.println(elevator.getCurrentFloor());
            elevator.move(2);
            System.out.println(elevator.getCurrentFloor());
            elevator.move(2);
            System.out.println(elevator.getCurrentFloor());
    }

}

