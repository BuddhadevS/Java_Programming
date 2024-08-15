package Santi_Nikaton;

import Collection_100.string;
	class Shadi_com 
	{
		static void criteria() throws ShadiException
			{
			int age = 17;
			if(age>=19)
				{
					System.out.println("You are not applicable");
				}
			else
			{
			throw new ShadiException("hello sir you are applicable");
			}
		}
	
	public static void main(String[] args) {
		try {
			criteria();
		}
		catch (ShadiException e) {
			// TODO: handle exception
			System.out.println(e.getmsg());
		}
		
	 }
	}
	class ShadiException extends Exception
	{
		private String msg;
		ShadiException(String msg)
		{
			this.msg=msg;
		}
		public String getmsg()
		{
			return msg;
		}
	}


