public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHit(30);
        boss.setBosshealth(700);
        System.out.println("Урон боса " + boss.getBossHit() + "  Здоровье боса " + boss.getBosshealth());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Урон героев: " + createHeroes()[i].getDamage()+ " Здоровье героев: " + createHeroes()[i].getLife() + " Супер способность героев: " + createHeroes()[i].getSuperpower());

        }
    }

    public static Hero[] createHeroes() {

        Hero Halk = new Hero(200,20,"Super punch");
        Hero Avatar = new Hero(150,30,"Aquatic");
        Hero Lava = new Hero(155,40,"Fiery");
        Hero[] Boes = {Halk, Avatar, Lava};
        return  Boes;


    }


}



        


