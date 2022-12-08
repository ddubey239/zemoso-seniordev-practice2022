public class StrateosCollaborators implements TeamStrateos {

    ZemosoLabs teamZemoso = new ZemosoLabs();

    @Override
    public void devlopSoftware(String productName) {
        teamZemoso.buildSoftware(productName);
    }

}
