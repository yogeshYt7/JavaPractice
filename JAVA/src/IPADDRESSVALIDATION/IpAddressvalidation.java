package IPADDRESSVALIDATION;

	import java.net.InetAddress;
	import java.net.UnknownHostException;
	import java.net.Inet4Address;
	import java.net.Inet6Address;


	public class IpAddressvalidation {

		public static void main(String[] args) throws UnknownHostException {
			// TODO Auto-generated method stub
			String str="126.166.50.50";
			// InetAddress is a final
			InetAddress address=InetAddress.getByName(str);
			if(address instanceof Inet4Address)
			{
				System.out.println(address +" is a valid IPV4 address");
			}else if(address instanceof Inet6Address)
			{
				System.out.println(address +" is a valid IPV6 address");	
			}else {
				System.out.println("Invaild Ip address ");
			}
		
		}

	}