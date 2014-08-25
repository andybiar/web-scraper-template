package com.andybiar.crossfitbot;

import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

public class Launcher {
	
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
