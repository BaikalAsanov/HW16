import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cow cow1=new Cow(600,13,"Male","cow1");
        Cow cow2=new Cow(460,6,"Female","cow2");
        Cow cow3=new Cow(787,5,"Male","cow3");
        Cow cow4=new Cow(900,9,"Male","cow4");
        Cow cow5=new Cow(1500,18,"Male","Cow5");
        Cow cow6=new Cow(800,13,"Female","cow6");
        Sheep sheep1=new Sheep(200,8,"Female","sheep1");
        Sheep sheep2=new Sheep(150,4,"Male","sheep2");
        Sheep sheep3=new Sheep(180,7,"Male","sheep3");
        Sheep sheep4=new Sheep(347,13,"Male","sheep4");
        Horse horse1=new Horse(400,5,"Female","horse1");
        Horse horse2=new Horse(500,5,"Female","horse2");
        Horse horse3=new Horse(800,17,"Female","horse3");
        AbstractAnimals[] animals1={cow1,cow2,cow3,cow4,cow5,
        sheep1,sheep2,sheep3,
        horse1,horse2};
        AbstractAnimals[] animals2={cow6,sheep4,horse3};
        Farm1 farm1=new Farm1("Moscow",animals1,"Bilal");
        Farm2 farm2=new Farm2("Osh",animals2,"Kumar");
        System.out.println(farm1.toString());
        System.out.println(farm2.toString());
    }
}