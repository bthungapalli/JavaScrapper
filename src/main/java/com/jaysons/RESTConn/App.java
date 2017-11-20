package com.jaysons.RESTConn;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App
{
	public static void main(String[] args) {
		String data="";
		try{
		URL url=new URL("https://api.nhtsa.gov/vehicles/bySearch?productDetail=minimal&data=recalls&query=2017&dateStart=&dateEnd=&sort=recallsCount&order=desc&max=10&name=");
		HttpURLConnection conn=(HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		
		int statuscode = conn.getResponseCode();
		System.out.println("Status Code : " +statuscode);
		if(statuscode!=200){
			throw new RuntimeException("status code is:"+statuscode);
		}else{
			Scanner sc=new Scanner(url.openStream());
			while(sc.hasNext()){
				data+=sc.nextLine();
			}
			System.out.println("Response in String Format---------------");
			System.out.println(data);
			sc.close();
		}
		JSONParser parser=new JSONParser();
		JSONObject obj=(JSONObject) parser.parse(data);
		
		JSONArray jsonarr_1 = (JSONArray) obj.get("recalls");
		for(int i=0;i<jsonarr_1.size();i++)
		{
			JSONObject jsonobj_1 = (JSONObject)jsonarr_1.get(i);
			JSONArray jsonarr_2 = (JSONArray) jsonobj_1.get("components");
			System.out.println("Elements under recalls array............");
			System.out.println(" id: " +jsonobj_1.get("id"));
			System.out.println("Types: "+jsonobj_1.get("manufacturer"));
			System.out.println("mfrCampaignNumber: "+jsonobj_1.get("mfrCampaignNumber"));
			System.out.println("nhtsaCampaignNumber: "+jsonobj_1.get("nhtsaCampaignNumber"));
			System.out.println("------------Elements Under components Array-------------");
			for(int j=0;j<jsonarr_2.size();j++){
				JSONObject jsonobj_2 = (JSONObject) jsonarr_2.get(j);
				String str_data1 = (String) jsonobj_2.get("id");
				System.out.println(str_data1);
				String str_data2 = (String) jsonobj_2.get("name");
				System.out.println(str_data2);
				String str_data3 = (String) jsonobj_2.get("description");
				System.out.println(str_data3);
				String str_data4 = (String) jsonobj_2.get("associatedDocumentsCount");
				System.out.println(str_data4);
				
			}
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
   
}
