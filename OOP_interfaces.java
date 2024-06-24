public class OOP_interfaces {

    private static class Person {
        protected int hp;
        protected String name;
        protected String weapon;
        protected int endurance;
        protected int mana;
        protected int fury;
        protected Hands hands;
        protected Foot foot;

        private Person(int hp, String name, String weapon, int endurance, int mana, int fury) {
            this.hp = hp;
            this.name = name;
            this.weapon = weapon;
            this.endurance = endurance;
            this.mana = mana;
            this.fury = fury;
            this.hands = null;
            this.foot = null;
        }


        public void equip(Hands Gloves) {
            if (Gloves != null) {
                hp += Gloves.hp; // если не пусто, то идет прирост ХП для персонажа
            } else {
                hp -= hands.hp; // иначе, минус ХП от предмета
            }
            hands = Gloves;
        }

        public void equip(Foot Boots) {
            if (Boots != null) {
                hp += Boots.hp; // если не пусто, то идет прирост ХП для персонажа
            } else {
                hp -= foot.hp; // иначе, минус ХП от предмета
            }
            foot = Boots;
        }

        private static Person createHunter(int hp, String name, int endurance) {
            return new Person(hp, name, "Onion", endurance, 0, 0);
        }

        private static Person createWarrior(int hp, String name, double fury) {
            int f = (int) fury;
            return new Person(hp, name, "Sword", 0, 0, f);
        }

        private static Person createDwarf(int hp, String name, int mana) {
            return new Person(hp, name, "Hex", 0, mana, 0);
        }
    }

    private static class Items {
        protected String name;
        protected int armor;
        protected int hp;

        private Items(String name, int armor, int hp) {
            this.name = name;
            this.armor = armor;
            this.hp = hp;
        }
    }

    private static class Hands extends Items {
        public Hands(String name, int armor, int hp) {
            super(name, armor, hp);
        }
    }

    private static class Foot extends Items {
        public Foot(String name, int armor, int hp) {
            super(name, armor, hp);
        }
    }

    public static void main(String[] args){
        Person warrior = Person.createWarrior(1000,"Alex",100.55);
        warrior.equip(new Hands("Перчатки",100,100));
        warrior.equip(new Foot("Бегунки",120,145));

        Person hunter = Person.createHunter(800,"Ivan",150);
        hunter.equip(new Foot("Ботинки",100,200));

        Person dwarf = Person.createDwarf(750, "Sergey",200);
        dwarf.equip(new Hands("Наручи", 200, 500));

        dwarf.equip((Hands) null);
        warrior.equip((Hands) null);
        hunter.equip((Foot) null);
    }
}
