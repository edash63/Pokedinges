public class Psychic extends Pokemon {
    public Psychic() {
        strong.add(sFighting);
        strong.add(sPoison);

        weak.add(sPsychic);
        weak.add(sSteel);

        useless.add(sDark);
    }

    public void psychicType() {
        System.out.println("Weak against: Psychic, Steel");
        System.out.println("Useless against: Dark");
        System.out.println("Strong against: Fighting, Poison");
    }
}
