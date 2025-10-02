package br.com.jstack.security.core;

public final class JwtSettings {
	private String jwkSetUri;
	private String publicKeyPem; // alternativa ao JWK
	private long clockSkewSeconds = 60;
	
	public String getJwkSetUri() { return jwkSetUri; }
	public void setJwkSetUri(String jwkSetUri) { this.jwkSetUri = jwkSetUri; }
	public String getPublicKeyPem() { return publicKeyPem; }
	public void setPublicKeyPem(String publicKeyPem) { this.publicKeyPem = publicKeyPem; }
	public long getClockSkewSeconds() { return clockSkewSeconds; }
	public void setClockSkewSeconds(long clockSkewSeconds) { this.clockSkewSeconds = clockSkewSeconds; }
}