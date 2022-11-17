package pas.pasback.Model;

import java.time.LocalDate;

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
    private int polId;
    private LocalDate effectDate;
    private String polHolder;
    private String vehicle;

    public Policy() {
    }

    public Policy(LocalDate effectDate, String polHolder, String vehicle) {
        this.effectDate = effectDate;
        this.polHolder = polHolder;
        this.vehicle = vehicle;
    }

    public Policy(int polId, LocalDate effectDate, String polHolder, String vehicle) {
        this.polId = polId;
        this.effectDate = effectDate;
        this.polHolder = polHolder;
        this.vehicle = vehicle;
    }

    public int getPolId() {
        return polId;
    }

    public void setPolId(int polId) {
        this.polId = polId;
    }

    public LocalDate getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(LocalDate effectDate) {
        this.effectDate = effectDate;
    }

    public String getPolHolder() {
        return polHolder;
    }

    public void setPolHolder(String polHolder) {
        this.polHolder = polHolder;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Policy [polId=" + polId + ", effectDate=" + effectDate + ", polHolder=" + polHolder + ", vehicle="
                + vehicle + "]";
    }

}
