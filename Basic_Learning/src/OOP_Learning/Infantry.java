package OOP_Learning;

public class Infantry implements shoot,treat {
    @Override
    public void treatment() {
        System.out.println("I can treat you");
    }

    @Override
    public void shootit() {
        System.out.println("I can shoot you");
    }
}
