package CommandDp;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	 private List<OrderImpl> orderList = new ArrayList<OrderImpl>(); 

	   public void takeOrder(OrderImpl order){
	      orderList.add(order);		
	   }

	   public void placeOrders(){
	   
	      for (OrderImpl order : orderList) {
	         order.execute();
	      }
	      orderList.clear();
	   }

}
