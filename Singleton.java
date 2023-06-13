package assignment;

public class Singleton 
{
	private long SBIupipin;
	private long ICICIupipin;
	private long CUBupipin;
	private static double SBIbalance=10000;
	private static double ICICIbalance=50000;
	private static double CUBbalance=30000;
	private static Singleton instance;
	private Singleton()
	{
		
	}
	public static Singleton instance()
	{
		if(instance==null)
		{
			instance=new Singleton();
		}
		return instance;
	}
	public long getSBIupipin() {
		return SBIupipin;
	}
	public void setSBIupipin(long sbiupipin) {
		SBIupipin = sbiupipin;
	}
	public long getICICIupipin() {
		return ICICIupipin;
	}
	public void setICICIupipin(long iciciupipin) {
		ICICIupipin = iciciupipin;
	}
	public long getCUBupipin() {
		return CUBupipin;
	}
	public void setCUBupipin(long cubupipin) {
		CUBupipin = cubupipin;
	}
	public static double getSBIbalance() {
		return SBIbalance;
	}
	public static void setSBIbalance(double sbibalance) {
		SBIbalance = sbibalance;
	}
	public static double getICICIbalance() {
		return ICICIbalance;
	}
	public static void setICICIbalance(double icicibalance) {
		ICICIbalance = icicibalance;
	}
	public static double getCUBbalance() {
		return CUBbalance;
	}
	public static void setCUBbalance(double cubbalance) {
		CUBbalance = cubbalance;
	}
	
	
	
	
}
