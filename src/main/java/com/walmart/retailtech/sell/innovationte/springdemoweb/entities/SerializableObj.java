package com.walmart.retailtech.sell.innovationte.springdemoweb.entities;

import java.io.Serializable;

public class SerializableObj
	implements Serializable
{
	private static final long serialVersionUID = 809399824640482147L;
	private byte[] message;
	
	public SerializableObj()
	{
		
	};
	
	public void printMessage()
	{
		System.out.println( message );
	}

	public byte[] getMessage()
	{
		return message;
	}

	public void setMessage( byte[] message )
	{
		this.message = message;
	}
	
}