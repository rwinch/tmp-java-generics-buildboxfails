
public class AuthenticationRegistryImpl implements AuthenticationRegistry {

	@Override
	public JdbcRegistry<JdbcRegistryImpl> jdbc() {
		return null;
	}

	@Override
	public InMemoryRegistry<InMemoryRegistryImpl> inMemory() {
		return null;
	}
}
