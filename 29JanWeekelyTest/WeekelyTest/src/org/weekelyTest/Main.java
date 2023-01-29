package org.weekelyTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		String url="https://jsonplaceholder.typicode.com/albums";
		//RequestBuild
		HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		
		//RequestObject
		HttpClient clients=HttpClient.newBuilder().build();
		
		//Get Response
		HttpResponse<String> httpResponse=clients.send(request,HttpResponse.BodyHandlers.ofString());
		
	
		System.out.println(httpResponse.body());
		
		
	}
}

