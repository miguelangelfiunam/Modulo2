package prinPatrDis.H02_DependencyInversion;

public class MongoDB implements DataBase {
	MongoDBConnection connection;

    
    
	@Override
	public void connect(String database) {
		// TODO Auto-generated method stub
		 connection = new MongoDBConnection(database);
	}

	@Override
	public void insert(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Inserting " + entity + " in MongoDB using " + connection.getDatabase());
	}

	@Override
	public void update(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Updating " + entity + " in MongoDB using " + connection.getDatabase());
	}

	@Override
	public void delete(Entity entity) {
		// TODO Auto-generated method stub
		System.out.println("Delete " + entity + " in MongoDB using " + connection.getDatabase());
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub

	}

}
