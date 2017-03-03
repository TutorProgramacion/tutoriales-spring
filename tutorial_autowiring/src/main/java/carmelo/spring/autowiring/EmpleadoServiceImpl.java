package carmelo.spring.autowiring;

public class EmpleadoServiceImpl implements EmpleadoService {

    private EmpleadoDao empleadoDao;

    public EmpleadoServiceImpl() {
        
    }
    
    public EmpleadoServiceImpl(EmpleadoDao empleadoDao) {
        this.empleadoDao = empleadoDao;
    }
    
    public void setEmpleadoDao(EmpleadoDao empleadoDao) {
        this.empleadoDao = empleadoDao;
    }
    
    public EmpleadoDao getEmpleadoDao() {
        return empleadoDao;
    }

}
