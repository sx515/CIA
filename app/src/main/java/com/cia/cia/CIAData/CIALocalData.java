package com.cia.cia.CIAData;
import java.io.*;

public class CIALocalData
{
	String DATA_FILE_PATH;
	File dataFile;
	public CIALocalData()
	{
		dataFile = new File(DATA_FILE_PATH);
		if (!dataFile.exists())
		{
			try
			{
				dataFile.createNewFile();
			}
			catch (IOException e)
			{}
		}
	}
}
