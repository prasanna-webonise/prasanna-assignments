/**
 * 
 */
package CommandDp;

/**
 * @author webonise
 *
 */
public class BuyStock implements OrderImpl {

	/**
	 * 
	 */
	private Stock stockEx;
	public BuyStock(Stock stockEx) {
		this.stockEx=stockEx;		
	}

	/* (non-Javadoc)
	 * @see CommandDp.OrderImpl#execute()
	 */
	@Override
	public void execute() {
		stockEx.buy();
	}

}
