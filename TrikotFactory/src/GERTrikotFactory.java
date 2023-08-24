public class GERTrikotFactory extends AbstractTrikotFactory{
    @Override
    public Trikot erstelleTrikot(String name, int nummer) {
        Spielertrikot trikot = new Spielertrikot();
        trikot.setColor1("schwarz");
        trikot.setColor2("weiss");


        trikot.setBack(
                   """ 
                RuckseiteGER
                """ + name +nummer);

        trikot.setFront("""
                VorderseiteGER
                """+ name +nummer);


        return trikot;
    }
}
