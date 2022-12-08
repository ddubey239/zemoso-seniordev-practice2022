public interface IChain {
    public void setNextChain(IChain chain);

    public void calculate(Numbers request);
}
