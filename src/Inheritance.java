public class Inheritance {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        Monster z1 = new Zombie(10, 100, "club");
        Skeleton s1 = new Skeleton(25, 50, "bow");
        Monster v1 = new Vampire();
        v1.move();
        s1.move();
        s1.attack();
    }
}
class Monster {
    double speed;
    double hp;
    String weapon;

    public Monster() {
        System.out.println("Default constructor for Monster");
    }
    public Monster(double speed, double hp, String weapon){
        System.out.println("Non-default constructor for Monster");
    }
    void move() {
        System.out.println("Monster moved");
    }
    void attack() {
        System.out.println("Monster attacked");
    }
}
class Skeleton extends Monster {
    public Skeleton() {
        System.out.println("Default constructor for Skeleton");
    }
    public Skeleton(double speed, double hp, String weapon){
        System.out.println("Non-default constructor for Skeleton");
    }

    @Override
    void move() {
        //super.move();
        System.out.println("Skeleton moved");
    }

    @Override
    void attack() {
        super.attack();
    }
}

class Vampire extends Monster {
    public Vampire() {
        System.out.println("Default constructor for Vampire");
    }
    public Vampire(double speed, double hp, String weapon){
        System.out.println("Non-default constructor for Vampire");
    }
}
class Zombie extends Monster {
    public Zombie() {
        System.out.println("Default constructor for Zombie");
    }
    public Zombie(double speed, double hp, String weapon){
        System.out.println("Non-default constructor for Zombie");
    }
}