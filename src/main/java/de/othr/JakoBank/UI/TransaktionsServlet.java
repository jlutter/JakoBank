package de.othr.JakoBank.UI;

import de.othr.JakoBank.Service.TransaktionsService;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = {"/Transaktion"})
public class TransaktionsServlet extends HttpServlet {

    @Inject
    private TransaktionsService transaktionsService;
}
