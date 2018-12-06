package de.othr.JakoBank.Entity.util;

import java.util.Objects;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class SingleIdEntity<PK> {
    public abstract PK getId();
    
    @Override
    public boolean equals(Object other) {
        if(other instanceof SingleIdEntity)
            return Objects.equals(this.getId(), ((SingleIdEntity)other).getId());
        else
            return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.getId());
    }
}
