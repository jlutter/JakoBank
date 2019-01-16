package de.othr.JakoBank.UI.converter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*@ApplicationScoped
public class TransaktionsConverter implements Converter {

   private Map<String, Studiengang> studiengaenge;

    @Inject
    private StudiengangService studiengangService;


    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String studiengangId) {
        return this.studiengaenge.get(studiengangId);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object studiengangObject) {
        if(studiengangObject.getClass().equals(Studiengang.class)) {
            Studiengang studiengang = (Studiengang)studiengangObject;
            return studiengang.getId();
        }
        else
            throw new IllegalArgumentException("Object must be of type Studiengang.class but is " + studiengangObject.getClass() + ".class");
    }

    @PostConstruct
    private void initStudiengangMap() {
        if(this.studiengaenge == null) {
            Collection<Studiengang> studiengaenge = studiengangService.getAlleStudiengaenge();
            this.studiengaenge = new HashMap<>();
            for(Studiengang stdgang : studiengaenge) {
                this.studiengaenge.put(stdgang.getId(), stdgang);
            }
        }
    }
}*/
