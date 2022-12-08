public class Strateos {
    private TeamStrateos teamStrateos;

    public void setTeamStrateos(TeamStrateos teamStrateos) {
        this.teamStrateos = teamStrateos;
    }

    public void BuildProduct(String productName) {
        teamStrateos.devlopSoftware(productName);
    }
}
