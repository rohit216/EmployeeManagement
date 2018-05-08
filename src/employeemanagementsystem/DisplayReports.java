
package employeemanagementsystem;

import net.sf.jasperreports.engine.JRException;

public class DisplayReports  extends JasperReports {

    public void showEmployees() throws JRException {
        m_report_source = "rptEmployees.jrxml";
        m_sql_stmt = "SELECT * FROM employees ORDER BY id";
        showReport();
    }
}
