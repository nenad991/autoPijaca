package Entity;
// Generated Jul 3, 2017 12:11:39 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Model generated by hbm2java
 */
@Entity
@Table(name="model"
    ,catalog="baza_automobila"
)
public class Model  implements java.io.Serializable {


     private Integer modelId;
     private Proizvodjac proizvodjac;
     private String modelIme;
     private Set<Oglas> oglases = new HashSet<Oglas>(0);

    public Model() {
    }

	
    public Model(Proizvodjac proizvodjac, String modelIme) {
        this.proizvodjac = proizvodjac;
        this.modelIme = modelIme;
    }
    public Model(Proizvodjac proizvodjac, String modelIme, Set<Oglas> oglases) {
       this.proizvodjac = proizvodjac;
       this.modelIme = modelIme;
       this.oglases = oglases;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="model_id", unique=true, nullable=false)
    public Integer getModelId() {
        return this.modelId;
    }
    
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="proizvodjac_id", nullable=false)
    public Proizvodjac getProizvodjac() {
        return this.proizvodjac;
    }
    
    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    
    @Column(name="model_ime", nullable=false, length=45)
    public String getModelIme() {
        return this.modelIme;
    }
    
    public void setModelIme(String modelIme) {
        this.modelIme = modelIme;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="model")
    public Set<Oglas> getOglases() {
        return this.oglases;
    }
    
    public void setOglases(Set<Oglas> oglases) {
        this.oglases = oglases;
    }

    @Override
    public String toString() {
        return modelIme;
    }




}


