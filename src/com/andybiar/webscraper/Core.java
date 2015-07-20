package com.andybiar.webscraper;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Core {
	
	public static void main(String[] args) {
		CloseableHttpClient client = HttpClients.createMinimal();
		
		try {
			HttpGet httpget = new HttpGet("http://www.crossfit.com");
			CloseableHttpResponse res = client.execute(httpget);
			String html = IOUtils.toString(res.getEntity().getContent());
			
			System.out.println(html);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
