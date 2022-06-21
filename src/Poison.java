public class Poison extends Pokemon {
    public Poison() {
        strong.add(sGrass);

        weak.add(sPoison);
        weak.add(sGround);
        weak.add(sRock);
        weak.add(sGhost);

        useless.add(sSteel);
    }

    public void poisonType() {
        System.out.println("Weak against: Poison, Ground, Rock, Ghost");
        System.out.println("Useless against: Steel");
        System.out.println("Strong against: Grass");
    }
}
