package prinPatrDis.H02_DependencyInversion;

public class BudgetReport implements Entity
{
    private DataBase database;

    public BudgetReport()
    {
//        this.database = new MySQLDatabase();
        this.database = new MongoDB();
        database.connect("projects");
    }

    public void save() {
        database.insert(this);
    }
    
    public void update() {
        database.update(this);
    }
    
    public void delete() {
        database.delete(this);
    }

	@Override
	public String toString() {
		return "BudgetReport";
	}
}
