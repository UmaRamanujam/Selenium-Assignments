package week4.day1;

public class APIClient {

		public void sendRequest(String endpoint)
		{
			System.out.println("You are calling a first method in Overloading: " +endpoint);
		}
		
		public void sendRequest(String endpoint, String requestBody, Boolean  requestStatus)
		{
			System.out.print("You are calling a Second method in Overloading: ");
			System.out.println(endpoint);
			System.out.println(requestBody);
			System.out.println(requestStatus);
		}
		
		public static void main(String[] args)
		{
		APIClient API = new APIClient();
		API.sendRequest("Endpoint of First Version");
		API.sendRequest("Endpoint of Second Version","RequestBody",true);
		
		

	}

}
