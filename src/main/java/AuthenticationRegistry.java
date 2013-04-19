
public interface AuthenticationRegistry {

	JdbcRegistry<? extends JdbcRegistry<?>> jdbc();

	InMemoryRegistry<? extends InMemoryRegistry<?>> inMemory();
}
