import java.rmi.Remote;
interface AddI extends Remote
	{
		public int add(int x,int y) throws Exception;
	}