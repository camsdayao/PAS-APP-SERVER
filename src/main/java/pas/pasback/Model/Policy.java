package pas.pasback.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String polNum;
    private String effectDate;
    private String expiDate;

    // @ManyToOne(cascade = CascadeType.ALL)
    // private Customer customer;

    public Policy() {
    }

    public Policy(String effectDate, String expiDate) {
        this.effectDate = effectDate;
        this.expiDate = expiDate;
    }

    // public Policy(int id, String polNum, String effectDate, String expiDate, Customer customer) {
    //     this.id = id;
    //     this.polNum = polNum;
    //     this.effectDate = effectDate;
    //     this.expiDate = expiDate;
        
    // }

    public Policy(int id, String polNum, String effectDate, String expiDate) {
        this.id = id;
        this.polNum = polNum;
        this.effectDate = effectDate;
        this.expiDate = expiDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolNum() {
        return polNum;
    }

    public void setPolNum(String polNum) {
        this.polNum = polNum;
    }

    public String getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate;
    }

    public String getExpiDate() {
        return expiDate;
    }

    public void setExpiDate(String expiDate) {
        this.expiDate = expiDate;
    }

    // public Customer getCustomer() {
    //     return customer;
    // }

    // public void setCustomer(Customer customer) {
    //     this.customer = customer;
    // }

}
