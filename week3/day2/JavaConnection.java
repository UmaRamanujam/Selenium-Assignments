package week3.day2;

public class JavaConnection implements DatabseConnection {

	@Override
	public void connect() {
		//boolean isConnected = true;
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		//boolean isConnected = false;
		System.out.println("Disconnected");
		
	}

	@Override
	public void executeUpdate(String Query) {
		
		System.out.println(Query +" Updated");
	}
	public void Status(String Text)
	{
		System.out.println(Text);
	}
	public static void main(String[] args) {
		JavaConnection JC=new JavaConnection();
		JC.connect();
		JC.executeUpdate("3 lines");
		JC.disconnect();
		JC.Status("Success");
	}

}
