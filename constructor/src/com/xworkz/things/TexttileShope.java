package com.xworkz.things;

public class TexttileShope {
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int ownerNoOfWifes;
	public int shopNo;
	public long contactNo;
	
	
	public TexttileShope()
	{
		super();
	}
	
	public TexttileShope(String ownerName)
	{
		this();
		this.ownerName=ownerName;
	}
	public TexttileShope( String ownerWifeName,long ownerDaughterNumber)
	{
		this("Jagadeesh");
		this.ownerDaughterNumber=ownerDaughterNumber;
		this.ownerWifeName=ownerWifeName;
	}
	public TexttileShope( String ownerWifeName,long ownerDaughterNumber, String ownerDaughterName)
	{
		this(ownerWifeName,9900775088L);
		this.ownerDaughterName=ownerDaughterName;
	}
	public TexttileShope(String ownerDaughterName,int ownerNoOfWifes)
	{
		this("GOURI",9900775088L,ownerDaughterName);
		this.ownerNoOfWifes=ownerNoOfWifes;
	}
	public TexttileShope(int ownerNoOfWifes,int shopNo )
	{
		this("pavitra",5);
		this.shopNo=shopNo;
	}
	public TexttileShope(int ownerNoOfWifes,int shopNo ,long contactNo)
	{
		this(5,12345);
		this.contactNo=contactNo;
	}
	
	public TexttileShope(int shopNo ,long contactNo )
	{
		this(5,shopNo,9900850325L);
		this.contactNo=contactNo;
	}
	
}
	
	
	

		
		
		
		
		
		
		
		
		
	
