package io.luministack.security.core;

public record JwtSettings(
	String jwkSetUri,
	String publicKeyPem,
	long clockSkewSeconds
) {
	public JwtSettings {
		if (clockSkewSeconds <= 0) {
			clockSkewSeconds = 60;
		}
	}
	public JwtSettings() {
		this(null, null, 60);
	}
}