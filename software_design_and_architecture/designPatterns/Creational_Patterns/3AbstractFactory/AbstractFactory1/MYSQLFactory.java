public class MYSQLFactory implements DBFactory {
    @Override
    public DB createDB() {
        return new MYSQL();
    }
}
