package br.com.jstack.security.core;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public final class SecuritySettings {
	private List<String> permitAll           = List.of();
	private List<String> relaxedProfiles     = List.of("local", "pipe");
	private CorsSettings cors                = new CorsSettings();
	private JwtSettings  jwt                 = new JwtSettings();
	private boolean      exposeSwagger       = true;
	private boolean      exposeActuatorBasic = true;
	
	public List<String> getPermitAll() {
		return permitAll;
	}
	
	public void setPermitAll(List<String> permitAll) {
		this.permitAll = List.copyOf(permitAll);
	}
	
	public List<String> getRelaxedProfiles() {
		return relaxedProfiles;
	}
	
	public void setRelaxedProfiles(List<String> relaxedProfiles) {
		this.relaxedProfiles = List.copyOf(relaxedProfiles);
	}
	
	@NotNull
	public CorsSettings getCors() {
		return cors;
	}
	
	public void setCors(CorsSettings cors) {
		this.cors = cors;
	}
	
	@NotNull
	public JwtSettings getJwt() {
		return jwt;
	}
	
	public void setJwt(JwtSettings jwt) {
		this.jwt = jwt;
	}
	
	public boolean isExposeSwagger() {
		return exposeSwagger;
	}
	
	public void setExposeSwagger(boolean exposeSwagger) {
		this.exposeSwagger = exposeSwagger;
	}
	
	public boolean isExposeActuatorBasic() {
		return exposeActuatorBasic;
	}
	
	public void setExposeActuatorBasic(boolean exposeActuatorBasic) {
		this.exposeActuatorBasic = exposeActuatorBasic;
	}
}