public class Bug extends Pokemon   {
    public Bug() {
        strong.add(sGrass);
        strong.add(sPsychic);
        strong.add(sDark);

        weak.add(sFire);
        weak.add(sFighting);
        weak.add(sPoison);
        weak.add(sFlying);
        weak.add(sGhost);
        weak.add(sSteel);
    }

    public void bugType() {
        System.out.println("Weak against: Fire, Fighting, Poison, Flying, Ghost, Steel");
        System.out.println("Useless against: none");
        System.out.println("Strong against: Grass, Psychic, Dark");
    }
}
