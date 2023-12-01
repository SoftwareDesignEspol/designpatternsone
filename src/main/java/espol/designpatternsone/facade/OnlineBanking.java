package espol.designpatternsone.facade;

public class OnlineBanking {
    private MobileSubsystem mobileSubsystem;
    private WebSubsystem webSubsystem;
    private TelephonicSubsystem telephonicSubsystem;

    public OnlineBanking() {
        this.mobileSubsystem = new MobileSubsystem();
        this.webSubsystem = new WebSubsystem();
        this.telephonicSubsystem = new TelephonicSubsystem();
    }

    public void doMobileBuy() { mobileSubsystem.doMobileTransaction(); }
    public void doWebBuy() { webSubsystem.doWebTransaction(); }
    public void doTelephonicBuy() { telephonicSubsystem.doTelephonicTransaction(); }
}
