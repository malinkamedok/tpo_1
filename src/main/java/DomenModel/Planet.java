package DomenModel;

public class Planet {

    private boolean isAlive;
    private boolean destroyed;
    private boolean conquered;

    private String name;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isConquered() {
        return conquered;
    }

    public void setConquered(boolean conquered) {
        this.conquered = conquered;
    }

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }

    public Planet(boolean isAlive, boolean destroyed, boolean conquered, String name) {
        this.isAlive = isAlive;
        this.destroyed = destroyed;
        this.conquered = conquered;
        this.name = name;


    }
}
