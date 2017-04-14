package carmelo.spring.controller;

import ar.com.fdvs.dj.core.DynamicJasperHelper;
import ar.com.fdvs.dj.core.layout.ClassicLayoutManager;
import ar.com.fdvs.dj.domain.builders.ColumnBuilderException;
import ar.com.fdvs.dj.domain.builders.FastReportBuilder;
import carmelo.spring.report.ReportGenerator;
import carmelo.spring.service.CustomerService;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/report/{fmt}")
    public String report(@PathVariable("fmt") String format, Model model) {

        model.addAttribute("format", format);
        model.addAttribute("datasource", customerService.findAll());
        model.addAttribute("generator", (ReportGenerator) this::customerReport);

        return "customer_DynamicReport";
    }

    private JasperReport customerReport(Map params) {
        try {
            FastReportBuilder drb = new FastReportBuilder();
            drb
                    .addColumn("ID", "ID", Integer.class.getName(), 10)
                    .addColumn("FIRSTNAME", "FIRSTNAME", String.class.getName(), 50)
                    .addColumn("LASTNAME", "LASTNAME", String.class.getName(), 50)
                    .addColumn("STREET", "STREET", String.class.getName(), 50)
                    .addColumn("CITY", "CITY", String.class.getName(), 50)
                    .setTitle("Primer informe con Dynamic Jasper")
                    .setPrintBackgroundOnOddRows(true)
                    .setUseFullPageWidth(true);

            return DynamicJasperHelper.generateJasperReport(
                    drb.build(), new ClassicLayoutManager(), params);

        } catch (ColumnBuilderException | ClassNotFoundException | JRException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
