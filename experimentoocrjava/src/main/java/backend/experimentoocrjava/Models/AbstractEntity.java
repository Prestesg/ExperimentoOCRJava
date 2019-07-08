package backend.experimentoocrjava.Models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id ;

    public AbstractEntity() {
    }

    public AbstractEntity(Long Id) {
        this.Id = Id;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public AbstractEntity Id(Long Id) {
        this.Id = Id;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AbstractEntity)) {
            return false;
        }
        AbstractEntity abstractEntity = (AbstractEntity) o;
        return Objects.equals(Id, abstractEntity.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            "}";
    }
}