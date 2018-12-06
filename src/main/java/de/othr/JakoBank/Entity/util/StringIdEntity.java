package de.othr.JakoBank.Entity.util;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class StringIdEntity extends SingleIdEntity<String> {

    @Id
    protected String id;
    
    
    @Override
    public String getId() {
        return this.id;
    }
    
}
