public class App {
    public static void main(String[] args) throws Exception {
        StrateosCollaborators strateosCollaborators = new StrateosCollaborators();
        Strateos strateos = new Strateos();
        strateos.setTeamStrateos(strateosCollaborators);
        strateos.BuildProduct("Cirrus");
    }
}
