package xmlrpc;

import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;


public class JavaWsClient {
   public static void main (String [] args) {
   
   
	   try {
			System.out.println("XML-RPC Client call to : http://localhost:1080/xmlrpc");
			XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
			config.setServerURL(new URL(
					"http://localhost:1080/xmlrpc"));
			XmlRpcClient client = new XmlRpcClient();
			client.setConfig(config);
			Object[] params = new Object[] {new String("David")};
			String response = (String) client.execute("HelloWorld.message", params);
			System.out.println("Message : " + response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

   }
}