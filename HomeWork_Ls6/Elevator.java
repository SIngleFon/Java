public class Elevator {

    private int MinFloor;
    private int MaxFloor;
    private int CurrentFloor;

    public Elevator(int minFloor, int MaxFloor){
        if(minFloor >= MaxFloor){
            throw new IllegalArgumentException("Минимальный этаж не может быть больше или равен максимального!");
        }
        this.MinFloor = minFloor;
        CurrentFloor = minFloor;
        this.MaxFloor = MaxFloor;
    }
    public Elevator(int MaxFloor){
        if(MaxFloor <= 1){
          throw new IllegalArgumentException("Укажите корректный этаж!");
        }
        MinFloor = 1;
        CurrentFloor = 1;
        this.MaxFloor = MaxFloor;
    }

    public String getCurrentFloor() {
        // String name = "[\\MinFloor]"
        return ("["+MinFloor+","+MaxFloor+"] --> "+CurrentFloor+" Вы находитесь на данном этаже");
    }

    public void move(int Floor){
        if(Floor == CurrentFloor){
            System.out.println("Вы уже на данном этаже!");
        }
        else{
        if((MinFloor <= Floor) & (Floor <= MaxFloor)){
            System.out.println("Перемещение на "+Floor+" этаж...."+"\n"+"Успешно!");
            CurrentFloor = Floor;
        }
        else{
            System.out.println("Невозможно, такого этажа нет");
            // throw new IllegalArgumentException("Невозможно, такого этажа нет");
        }
    }
    }

}
