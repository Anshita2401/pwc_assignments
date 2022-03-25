package assignmentDay4;

public class CustomerTester {
	public void acceptCustomerInfo() {
		System.out.println("\n\n Please enter the deatils of the customer");
		System.out.println("Customer id: ");
		String custId=ReadCustomer.acceptString();
		System.out.println("Customer Name: ");
		String custName=ReadCustomer.acceptString();
		Customer customer=new Customer();
		customer.setCustomerId(Integer.parseInt(custId));
		customer.setCustomerName(custName);
		int status =new CustomerFileDB().saveCustomer(customer);
		//int status=new CustomerFileDB.saveCustomer(customer);
		if(status==0) {
			System.out.println("Your details are saved");
			ReadCustomer.acceptString();
			System.out.println("\n\n\n\n\n");
		}else {
			System.out.println("Your details could not be save.Please try later");
			ReadCustomer.acceptString();
			System.out.println("\n\n\n\n\n\n");
		}
	}
	public void displayCustInfo() {
		System.out.println("\n\n Please enter customer Id:");
		String custId=ReadCustomer.acceptString();
		Customer customer=new CustomerFileDB().getCustomer(Integer.parseInt(custId));
		if(customer!=null) {
			System.out.println("\n Customer Id "+customer.getCustomerId());
			System.out.println("\n Customer Name "+customer.getCustomerName());
		}else {
			System.out.println("Invalid Customer id!!!");
			ReadCustomer.acceptString();
			System.out.println("\n\n\n\n\n\n");
		}
	}
	
	public void customerMenu() {
		while(true) {
			System.out.println("\t Customer Menu");
			System.out.println("--------------------------------------------");
			System.out.println("1. Add Customer");
			System.out.println("2. Get Csutomer Info");
			System.out.println("3. Exit");
			System.out.println("\n Enter option :");
			String optedValue=ReadCustomer.acceptString();
			int option=Integer.parseInt(optedValue);
			switch(option) {
			case 1: acceptCustomerInfo(); break;
			case 2: displayCustInfo(); break;
			case 3: System.exit(0); break;
			default: System.out.println("Enter a valid option");
			ReadCustomer.acceptString();
			}
		}
	}
}
