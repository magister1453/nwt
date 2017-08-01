package za.co.nwt.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by marc.marais on 2017-08-01.
 */
@Entity
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    @OneToMany(mappedBy = "school")
    Set<Tenant> tenantList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Tenant> getTenantList() {
        return tenantList;
    }

    public void setTenantList(Set<Tenant> tenantList) {
        this.tenantList = tenantList;
    }
}
