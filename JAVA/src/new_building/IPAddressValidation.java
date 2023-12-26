package new_building;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.Inet4Address;
import java.net.Inet6Address;

public class IPAddressValidation {
	public static void main(String[] args) {
		String str="126.166.50.50";
		try{
			InetAddress ipa=InetAddress.getByName(str);
			if(ipa instanceof Inet4Address)
			{
				System.out.println(ipa+" is valid IPv4 Address");
			}
			else if (ipa instanceof Inet6Address)
			{
				System.out.println(ipa+" is valid IPV6Address");
			}
		}
		catch(UnknownHostException e)
		{
			System.out.println("Invalid IP address");
		}
	}

}
