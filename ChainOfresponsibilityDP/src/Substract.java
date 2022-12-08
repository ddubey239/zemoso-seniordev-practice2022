public class Substract implements IChain {
    private IChain nextChain;

    @Override
    public void setNextChain(IChain chain) {
        this.nextChain = chain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "substract") {
            System.out.println(request.getNumber1() - request.getNumber2());
        } else
            nextChain.calculate(request);
    }
}
