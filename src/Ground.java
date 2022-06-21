public class Ground extends Pokemon {
    public Ground() {
        strong.add(sFire);
        strong.add(sElectric);
        strong.add(sPoison);
        strong.add(sRock);
        strong.add(sSteel);

        weak.add(sGrass);
        weak.add(sBug);

        useless.add(sFlying);
    }

    public void groundType() {
        System.out.println("Weak against: Grass, Bug");
        System.out.println("Useless against: Flying");
        System.out.println("Strong against: Fire, Electric, Poison, Rock, Steel");
    }
}
