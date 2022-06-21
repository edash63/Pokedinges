public class Flying extends Pokemon {
    public Flying() {
        strong.add(sGrass);
        strong.add(sFighting);
        strong.add(sBug);

        weak.add(sElectric);
        weak.add(sRock);
        weak.add(sSteel);
    }

    public void flyingType() {
        System.out.println("Weak against: Electric, Rock, Steel");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Grass, Fighting, Bug");
    }
}
