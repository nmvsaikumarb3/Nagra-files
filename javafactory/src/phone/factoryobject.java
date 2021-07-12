package phone;

public class factoryobject {
	public osinterface getinstance(String str)
	{
		if(str.equals("open"))
		{
			return new android();
		}
		else if(str.equals("close"))
		{
			return new ios();
		}
		else
		{
			return new windows();
		}
	}

}
