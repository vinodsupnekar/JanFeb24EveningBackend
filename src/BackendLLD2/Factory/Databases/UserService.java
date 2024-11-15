package BackendLLD2.Factory.Databases;

import AbstractClasses.User;
import BackendLLD2.Factory.Databases.Queries.NoSQLQuery;
import BackendLLD2.Factory.Databases.Queries.Query;
import BackendLLD2.Factory.Databases.Queries.SQLQuery;

public class UserService {

    private Database database;

    UserService(Database database) {
        this.database = database;
    }

    public void createUser(User user) {
        Query q = QueryFactory.getQueryByDatabase(database);
    }
}