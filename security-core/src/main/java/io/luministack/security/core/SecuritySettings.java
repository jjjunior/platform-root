package io.luministack.security.core;

import java.util.List;
import jakarta.validation.constraints.NotNull;

public record SecuritySettings(
	List<String> permitAll,
	List<String> relaxedProfiles,
	@NotNull CorsSettings cors,
	@NotNull JwtSettings jwt,
	boolean exposeSwagger,
	boolean exposeActuatorBasic
) {
	public SecuritySettings {
		permitAll = List.copyOf(permitAll == null ? List.of() : permitAll);
		relaxedProfiles = List.copyOf(relaxedProfiles == null ? List.of("local", "pipe") : relaxedProfiles);
		cors = cors == null ? new CorsSettings() : cors;
		jwt = jwt == null ? new JwtSettings() : jwt;
	}
	
	public SecuritySettings() {
		this(
			List.of(),
			List.of("local", "pipe"),
			new CorsSettings(),
			new JwtSettings(),
			true,
			true
		);
	}
}