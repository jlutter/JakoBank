package de.othr.JakoBank.UI.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collection;

@Named
@SessionScoped
public class KundenMgmtModel implements Serializable {

    /*private Student tempStudent = new Student();
    private Adresse tempAdresse = new Adresse();
    private Student lastImmatrikuliert = new Student();
    private Studiengang studiengang;
    private Collection<Studiengang> studiengaenge;
    private boolean lernBestaetigung = false;
    private boolean inAenderung = false;

    @Inject
    private StudiengangService studiengangService;

    @Inject
    private StudentService studierendenService;

    @Inject
    private StudiengangConverter studiengangConverter;

    // Action-Methoden
    public String immatrikulieren() {
        this.tempStudent.setAdresse(this.tempAdresse);
        this.lastImmatrikuliert = this.studierendenService.registerStudent(this.tempStudent, this.studiengang);
        this.tempAdresse = new Adresse();
        this.tempStudent = new Student();
        this.lernBestaetigung = false;
        return "bestaetigung";
    }

    public String hinzufuegen() {
        // Datenchecks...
        return "details_student";
    }

    public String aendernVorbereiten(Student student) {
        this.inAenderung = true;
        this.tempStudent = student;
        if(student.getAdresse() == null)
            student.setAdresse(new Adresse());
        this.tempAdresse = student.getAdresse();
        return "students";
    }

    public String aendern() {
        this.inAenderung = false;
        this.tempStudent.setAdresse(this.tempAdresse);
        studierendenService.changeStudentData(this.tempStudent);
        if(!this.studiengang.equals(tempStudent.getStudiengang()))
            studierendenService.changeStudiengang(this.tempStudent, this.studiengang);

        this.tempStudent = new Student();
        this.tempAdresse = new Adresse();

        return "students";
    }

    public String loeschen(Student student) {
        this.studierendenService.unregisterStudent(student);
        return "students";
    }

    // Getter/Setter
    public Student getTempStudent() {
        return tempStudent;
    }

    public void setTempStudent(Student tempStudent) {
        this.tempStudent = tempStudent;
    }

    public Adresse getTempAdresse() {
        return tempAdresse;
    }

    public void setTempAdresse(Adresse tempAdresse) {
        this.tempAdresse = tempAdresse;
    }

    public Studiengang getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(Studiengang studiengang) {
        this.studiengang = studiengang;
    }

    public Collection<Studiengang> getStudiengaenge() {
        if(this.studiengaenge == null)
            this.studiengaenge = studiengangService.getAlleStudiengaenge();
        return studiengaenge;
    }

    public void setStudiengaenge(Collection<Studiengang> studiengaenge) {
        this.studiengaenge = studiengaenge;
    }

    public Collection<Student> getStudierende() {
        return studierendenService.getAllStudents();
    }

    public void setStudierende(Collection<Student> studierende) {
        throw new IllegalStateException("Studierende können nicht als Bulk-Operation über das Modell geändert werden!");
    }

    public StudiengangConverter getStudiengangConverter() {
        return studiengangConverter;
    }

    public void setStudiengangConverter(StudiengangConverter studiengangConverter) {
        this.studiengangConverter = studiengangConverter;
    }

    public boolean isLernBestaetigung() {
        return lernBestaetigung;
    }

    public void setLernBestaetigung(boolean lernBestaetigung) {
        this.lernBestaetigung = lernBestaetigung;
    }

    public Student getLastImmatrikuliert() {
        return lastImmatrikuliert;
    }

    public void setLastImmatrikuliert(Student lastImmatrikuliert) {
        this.lastImmatrikuliert = lastImmatrikuliert;
    }

    public boolean isInAenderung() {
        return inAenderung;
    }

    public void setInAenderung(boolean inAenderung) {
        this.inAenderung = inAenderung;
    }*/
}
