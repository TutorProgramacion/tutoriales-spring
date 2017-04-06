package carmelo.spring.view;

import carmelo.spring.model.Customer;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;

public class PdfView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(
            Map<String, Object> model,
            Document document,
            PdfWriter writer,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        List<Customer> customerList = (List<Customer>) model.get("customerList");

        PdfPTable table = new PdfPTable(5);

        table.addCell("ID");
        table.addCell("First Name");
        table.addCell("Last Name");
        table.addCell("Street");
        table.addCell("City");
        
        customerList.forEach(customer -> {
            table.addCell(customer.getId().toString());
            table.addCell(customer.getFirstName());
            table.addCell(customer.getLastName());
            table.addCell(customer.getStreet());
            table.addCell(customer.getCity());
        });

        document.add(table);
    }

}
