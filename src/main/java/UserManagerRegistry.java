
public interface UserManagerRegistry<T extends UserManagerRegistry<T>> {

	UserDetailsBuilderImpl<T> withUser(String username);
}
