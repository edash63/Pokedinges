public class Ghost extends Pokemon {
    public Ghost() {
        strong.add(sPsychic);
        strong.add(sGhost);

        weak.add(sDark);
        weak.add(sSteel);

        useless.add(sNormal);
    }
    public void ghostType() {
        System.out.println("Weak against: Dark, Steel");
        System.out.println("Useless against: Normal");
        System.out.println("Strong against: Psychic, Ghost");
    }
}
