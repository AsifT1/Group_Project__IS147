public class CashSent implements CashProcessing {
    @Override
    public void processed() {
        System.out.println("Your cash payment has been received!");
    }
}
