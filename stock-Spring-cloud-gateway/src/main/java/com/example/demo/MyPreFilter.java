package com.example.demo;


import org.slf4j.Logger;
import java.util.List;
import java.util.Set;


import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyPreFilter implements GlobalFilter  {

	private Logger logger=LoggerFactory.getLogger(MyPreFilter.class);
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		ServerHttpRequest request = exchange.getRequest();
		HttpHeaders headers = request.getHeaders();
		Set<String> keySet = headers.keySet();
		keySet.forEach(key->{
			List<String> values=headers.get(key);
			System.out.println(key+":"+values);
		});
			
		
		logger.info("pre filter"+"executed");
		return chain.filter(exchange);
	}

}
