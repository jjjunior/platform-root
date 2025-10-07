package io.luministack.security.core;

import java.util.List;

public final class CorsSettings {
	private List<String> allowedOrigins   = List.of();
	private List<String> allowedHeaders   = List.of("Authorization", "Content-Type");
	private List<String> allowedMethods   = List.of("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS");
	private boolean      allowCredentials = true;
	
	public List<String> getAllowedOrigins() {
		return allowedOrigins;
	}
	
	public void setAllowedOrigins(List<String> allowedOrigins) {
		this.allowedOrigins = List.copyOf(allowedOrigins);
	}
	
	public List<String> getAllowedHeaders() {
		return allowedHeaders;
	}
	
	public void setAllowedHeaders(List<String> allowedHeaders) {
		this.allowedHeaders = List.copyOf(allowedHeaders);
	}
	
	public List<String> getAllowedMethods() {
		return allowedMethods;
	}
	
	public void setAllowedMethods(List<String> allowedMethods) {
		this.allowedMethods = List.copyOf(allowedMethods);
	}
	
	public boolean isAllowCredentials() {
		return allowCredentials;
	}
	
	public void setAllowCredentials(boolean allowCredentials) {
		this.allowCredentials = allowCredentials;
	}
}