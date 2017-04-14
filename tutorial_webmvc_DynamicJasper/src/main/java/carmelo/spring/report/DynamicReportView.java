package carmelo.spring.report;

import java.util.Collection;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;

public class DynamicReportView extends JasperReportsMultiFormatView {

    @Override
    protected JasperReport loadReport() {
        return null;
    }

    @Override
    protected JasperPrint fillReport(Map<String, Object> model) throws Exception {

        JRDataSource ds = new JRBeanCollectionDataSource((Collection<?>) model.get("datasource"));
        ReportGenerator rg = (ReportGenerator) model.get("generator");
        
        JasperReport jr = rg.generateReport(model);
        JasperPrint jp = JasperFillManager.fillReport(jr, model, ds);
        
        return jp;
    }
 
}
