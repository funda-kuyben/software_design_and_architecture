public class ORACLEFactory implements DBFactory {
    @Override
    public DB createDB() {
        return new ORACLE();
    }
}
