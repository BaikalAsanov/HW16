import java.util.Arrays;

public abstract class AbstractFarms {
    private String address;
    private AbstractAnimals[] animals;
    private String ownerName;

    public AbstractFarms(String address, AbstractAnimals[] animals, String ownerName) {
        this.address = address;
        this.animals = animals;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AbstractAnimals[] getAnimals() {
        return animals;
    }

    public void setAnimals(AbstractAnimals[] animals) {
        this.animals = animals;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "AbstractFarms{" +
                "address='" + address +'\n'+ '\'' +
                ", animals=" + Arrays.toString(animals) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
