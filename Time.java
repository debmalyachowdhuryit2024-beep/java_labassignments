public class Time
{
	//instance variables
	int hour;
	int minute;
	int second;

	public Time(int h,int m,int s)
	{
		hour = h;
		minute = n;
		second = s;
	}

	public Time()
	{

	}
	void display(int hour,int min,int second)
	{
		int time = (hour*10000+min*100+sec*1)
		{
			if(time>= 000000 && time<=120000)
			{
				System.out.println("time is now"+hour+min+sec+"a.m.");
			}
			else
			{
				System.out.println("time is now: "hour+min+sec+"p.m.");
			}
		}
	}

	
}
