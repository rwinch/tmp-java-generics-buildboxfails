
public class UserDetailsBuilderImpl<T extends UserManagerRegistry<T>> {
	private final T builder;

    private UserDetailsBuilderImpl(T builder) {
        this.builder = builder;
    }

	public UserDetailsBuilderImpl<T> password(String password) {
		return this;
	}

	public T and() {
		return builder;
	}
}
