package com.jaysons.RESTConn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

//import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class Object2Json {

	public static void main(String[] args) throws JsonIOException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		/*mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try{
			File jsonInputFile = new File("C:\recalls main.txt");
			@JsonIgnoreProperties(ignoreUnknown=true)
			URL url=new URL("https://api.nhtsa.gov/vehicles/bySearch?productDetail=minimal&data=recalls&query=2017&dateStart=&dateEnd=&sort=recallsCount&order=desc&max=10&name=");
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			Meta m=mapper.readValue(url,Meta.class);
			System.out.println(m);
		}catch(IOException e){
			e.printStackTrace();
		}
		public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
			MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
			converter.setObjectMapper(new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
					.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true).configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true));
			return converter;*/

		Gson gson=new Gson();
		Meta m=new Meta();
		gson.toJson(m, new FileWriter("D:\\file.json"));
		String jsonInString = gson.toJson(m);
		System.out.println(jsonInString);
	}

}
