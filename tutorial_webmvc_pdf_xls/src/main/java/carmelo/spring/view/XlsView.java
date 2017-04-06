package carmelo.spring.view;

import carmelo.spring.model.Customer;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class XlsView extends AbstractXlsView {

    @Override
    protected void buildExcelDocument(
            Map<String, Object> model,
            Workbook workbook,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // cambiar nombre de archivo
        response.setHeader("Content-Disposition", "attachment; filename=\"customer.xls\"");

        // crear una pagina excel
        Sheet sheet = workbook.createSheet("Customer List");

        Row header = sheet.createRow(0);

        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Firt Name");
        header.createCell(2).setCellValue("Last Name");
        header.createCell(3).setCellValue("Street");
        header.createCell(4).setCellValue("City");

        int count_row = 1;

        for (Customer customer : (List<Customer>) model.get("customerList")) {
            Row customerRow = sheet.createRow(count_row++);

            customerRow.createCell(0).setCellValue(customer.getId());
            customerRow.createCell(1).setCellValue(customer.getFirstName());
            customerRow.createCell(2).setCellValue(customer.getLastName());
            customerRow.createCell(3).setCellValue(customer.getStreet());
            customerRow.createCell(4).setCellValue(customer.getCity());
        }
    }

}
