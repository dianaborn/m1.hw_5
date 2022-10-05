public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHit(30);
        boss.setBosshealth(700);
        System.out.println("Жизнь воса " + boss.getBossHit() + "  Жизнь героев " + boss.getBosshealth());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("Óðîí ãåðîåâ: " + createHeroes()[i].getDamage()+ " Çäîðîâüå ãåðîåâ: " + createHeroes()[i].getLife() + " Ñóïåð ñïîñîáíîñòü ãåðîåâ: " + createHeroes()[i].getSuperpower());

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



        


