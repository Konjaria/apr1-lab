package ge.tsu.classes;

public class smallTower extends House{
    {
        this.floor = 1;
    }
    public smallTower() {
    }

    public smallTower(int floor, boolean elevatorPresented, int entrances) {
        super(0, elevatorPresented, entrances);
    }

    @Override
    public void destroy() {
        System.out.println("Destroyed Easily!");
    }

}
