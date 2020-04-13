package Game;

class Warrior extends Hero {

    public Warrior() {
        super();
        health=300+(int)(Math.random()*100);
        damage= 100+(int) (Math.random()*100);
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            if(health <= 0) {
                System.out.println("Герой "+this.name+ " погиб и бить не может!");
            } else {
                if(hero.health >0)
                    hero.causeDamage(damage);
                System.out.println(this.name + " нанес урон " + hero.name);
            }
            hero.info();
        }
    }

    @Override
    void healing(Hero hero) {
        System.out.println("Войны не умеют лечить!");
    }
}
