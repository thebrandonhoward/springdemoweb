package com.walmart.retailtech.sell.innovationte.springdemoweb.interactors.mains;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.google.gson.Gson;
import com.walmart.retailtech.sell.innovationte.springdemoweb.entities.Associate;
import com.walmart.retailtech.sell.innovationte.springdemoweb.entities.ProgrammingLanguages;
import com.walmart.retailtech.sell.innovationte.springdemoweb.entities.SerializableObj;

public class SpringdemowebSerializableMain
{
	public static void main(String[] args)
			 throws IOException, ClassNotFoundException
	{
		//SpringdemowebSerializableMain.doObjectStream();
		SpringdemowebSerializableMain.doByteStream();
	}
	
	public static void doByteStream() 
			throws ClassNotFoundException, IOException
	{
		//String encrypt = "Creating a byte string.";
		
		Associate associate = new Associate();
		associate.setFirstname( "Brandon" );
		associate.setLastname( "Howard" );
		associate.setMiddleinit( 'E' );
		
		Gson gson = new Gson();
		String encrypt = gson.toJson( associate );
		
		System.out.println( "String = " + encrypt );
		
		byte[] bytes = encrypt.getBytes();
		System.out.println( "Converting to byte array = " + bytes );
		
		SerializableObj serObj
			= SpringdemowebSerializableMain.doObjectStream( bytes );
		System.out.println( "Returning stored serialized byte array = " + serObj.getMessage() );
		
		String decrypt = new String( serObj.getMessage() );
		System.out.println( "Decrypting byte array = " + decrypt );	
		
		
	}
	
	public static SerializableObj doObjectStream( byte[] encrypt )
			throws IOException, ClassNotFoundException
	{
		SerializableObj serializableObj 
		= new SerializableObj();
	
		//serializableObj.setMessage( "Serializing object( " + serializableObj + " ) now." );
		serializableObj.setMessage( encrypt );
		serializableObj.printMessage();
		
		FileOutputStream foutStream = new FileOutputStream( "serial.data" );
		
		ObjectOutputStream objoutStream = new ObjectOutputStream( foutStream );
		
		objoutStream.writeObject( serializableObj );
		
		objoutStream.close();
		
		//
		
		ObjectInputStream objinStream 
			= new ObjectInputStream( new FileInputStream( "serial.data" ) );
		
		SerializableObj read = (SerializableObj) objinStream.readObject();
		
		System.out.println( "Deserializing object( " + read + " ) now." );
		System.out.println( "Deserialized message( " + read.getMessage() + " )." );
		
		objinStream.close();
		
		return read;
	}
}
