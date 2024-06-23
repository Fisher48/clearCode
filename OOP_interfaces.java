public class OOP_interfaces {

    public static class Person {
        protected int hp;
        protected String name;
        protected String weapon;

        private Person(int hp, String name, String weapon) {
            this.hp = hp;
            this.name = name;
            this.weapon = weapon;
        }

    }

    public static Person createHunter(int hp, String name) {
        return new Person(hp, name, "Onion");
    }

    public static Person createWarrior(int hp, String name) {
        return new Person(hp, name, "Sword");
    }

    public static Person createDwarf(int hp, String name) {
        return new Person(hp, name, "Hex");
    }

    public static class Items {
        protected String name;
        protected int armor;
        protected int hp;

        public Items(String name, int armor, int hp){
            this.name = name;
            this.armor = armor;
            this.hp = hp;
        }
    }

    public static Items grabHunter(String name, int armor, int hp) {
        return new Items(name, armor, hp);
    }

    public static Items grabWarrior(String name, int armor, int hp) {
        return new Items(name, armor, hp);
    }

    public static Items grabDwarf(String name, int armor, int hp) {
        return new Items(name, armor, hp);
    }

    public class Hands extends Items {
        public Hands(String name, int armor, int hp) {
            super(name, armor, hp);
        }
    }

    public class Foot extends Items {
        public Foot(String name, int armor, int hp) {
            super(name, armor, hp);
        }
    }


    public static void main(String[] args){
        Person warrior1 = createWarrior(1000,"Alex");
        Person hunter1 = createHunter(800,"Ivan");
        Person dwarf1 = createDwarf(750, "Sergey");

    }
}
