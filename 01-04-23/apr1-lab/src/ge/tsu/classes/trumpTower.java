package ge.tsu.classes;

public class trumpTower extends House{
    public trumpTower() {
    }

    public trumpTower(int floor, boolean elevatorPresented, int entrances) {
        super(floor, elevatorPresented, entrances);
    }

    @Override
    public void destroy() {
        System.out.println("Trump Tower Destroyed!");
    }

}
