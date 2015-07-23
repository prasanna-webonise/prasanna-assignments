package CommandDp;

public class SellStock implements OrderImpl {

	private Stock stockEx;
	public SellStock(Stock stockEx) {
		this.stockEx=stockEx;
	}

	@Override
	public void execute() {
		stockEx.sell();
	}

}
