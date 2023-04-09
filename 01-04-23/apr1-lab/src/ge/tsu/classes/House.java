package ge.tsu.classes;

public abstract class House {
    protected int floor;
    protected boolean elevatorPresented;
    protected int entrances;

    public House(){}

    public House(int floor, boolean elevatorPresented, int entrances) {
        this.floor = floor;
        this.elevatorPresented = elevatorPresented;
        this.entrances = entrances;
    }

    public int getEntrances() {
        return entrances;
    }

    public int getFloor() {
        return floor;
    }

    public boolean isElevatorPresented() {
        return elevatorPresented;
    }

    public void setElevatorPresented(boolean elevatorPresented) {
        this.elevatorPresented = elevatorPresented;
    }

    public void setEntrances(int entrances) {
        this.entrances = entrances;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                ", elevatorPresented=" + elevatorPresented +
                ", entrances=" + entrances +
                '}';
    }

    public abstract void destroy();

}
