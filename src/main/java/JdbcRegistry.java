import javax.sql.DataSource;


public interface JdbcRegistry<T extends JdbcRegistry<T>> extends UserManagerRegistry<T> {

	T dataSource(DataSource dataSource);
}
