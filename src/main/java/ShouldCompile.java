public class ShouldCompile {

	public void run(AuthenticationRegistry registry) {
		registry
			.jdbc()
				.withUser("user").password("password").and()
				.withUser("admin").password("password").and()
				.dataSource(null);

		registry
			.inMemory()
				.withUser("user").password("password").and()
				.withUser("admin").password("password").and();
	}

	public void run(AuthenticationRegistryImpl registry) {
		registry
			.jdbc()
				.withUser("user").password("password").and()
				.withUser("admin").password("password").and()
				.dataSource(null)
			.build();

		registry
			.inMemory()
				.withUser("user").password("password").and()
				.withUser("admin").password("password").and()
			.build();
	}
}
