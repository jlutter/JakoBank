package de.othr.JakoBank.UI;

import de.othr.JakoBank.Entity.Adresse;
import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Name;
import de.othr.JakoBank.Service.Kundenverwaltung;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/Angestellter"})
public class AngestellterServlet extends HttpServlet {
    // Dependencies

    @Inject
    private Kundenverwaltung kundenverwaltung;

    /*@Inject
    private InitService initService;*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Standard-Entities initialisieren
        //initService.init();

        ServletOutputStream out = resp.getOutputStream();

        Kontoinhaber kontoinhaber = new Kontoinhaber();

        out.println("<html>");
        out.println("<head/>");
        out.println("<body>");
        out.println("<h1>Kundenverwaltung</h1>");

        out.println("<form method=\"post\">");
        if("laden".equals(req.getParameter("action"))) {
            String kundenId = req.getParameter("Id");
            kontoinhaber = kundenverwaltung.getKundebyId(Long.parseLong(kundenId));
            out.println("Kunden ID: ");
            out.println(kundenId + "<br/>");
        }
        out.println("Name:");
        out.println("<input type=\"text\" name=\"kunden_name\" value=\"");
        if(kontoinhaber.getName() != null)
            out.println(kontoinhaber.getName().toString());
        out.println("\"/><br/>");

        if("laden".equals(req.getParameter("action"))) {
            String kundenId = req.getParameter("Id");
            out.println("<input type=\"hidden\" name=\"Id\" value=\"" + kundenId + "\">");
            out.println("<input type=\"submit\" value=\"Aendern\" name=\"action\"/><br/>");
        } else {
            out.println("<input type=\"submit\" value=\"Neuer Kunde\" name=\"action\"/><br/>");

        }

        if("Neuer Kunde".equals(req.getParameter("action"))) {
            Adresse adresse = new Adresse();
            Name name = new Name("daf", "dafd");
            kontoinhaber = new Kontoinhaber(
                    1518685,
                    name,
                    //req.getParameter("kunden_name"),
                    adresse
            );
            kontoinhaber = kundenverwaltung.newKontoinhaber(kontoinhaber.getTelnum(), kontoinhaber.getName(),adresse, null);
        }
        else if("Aendern".equals(req.getParameter("action"))) {
            Adresse adresse = new Adresse();
            Name name = new Name("daf", "dafd");
            kontoinhaber = new Kontoinhaber(
                    15,
                    name,
                    //req.getParameter("kunden_name"),
                    adresse
            );
            kontoinhaber.setId(Long.parseLong(req.getParameter("Id")));
            kontoinhaber = kundenverwaltung.changeKontoinhaber(kontoinhaber);
        }
        else if("loeschen".equals(req.getParameter("action"))) {
            kontoinhaber = new Kontoinhaber();
            kontoinhaber.setId(Long.parseLong(req.getParameter("Id")));
            kundenverwaltung.deleteKontoinhaber(kontoinhaber);
        }
        out.println("</form>");

        List<Kontoinhaber> all = kundenverwaltung.getAllKontoinhaber();
        out.println("<table>");
        for(Kontoinhaber inhaber : all) {
            out.println("<tr>");
            out.println("<td>" + inhaber.getId() + "</td>");
            out.println("<td>" + inhaber.getName().toString() + "</td>");
            out.println("<td>" + inhaber.getTelnum() + "</td>");
            out.println("<td><form method=\"post\"><input type=\"hidden\" name=\"Id\" value=\"" + inhaber.getId() + "\"><input type=\"submit\" name=\"action\" value=\"laden\">&nbsp;<input type=\"submit\" name=\"action\" value=\"loeschen\"></form></td>");
            out.println("<tr>");
        }
        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
