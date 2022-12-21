package pas.pasback.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Claims {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String claimNum;
    private String dateAccident;
    private String descriptionAccident;
    private String vehicleDamage;
    private double repairCost;

    public Claims() {
    }

    public Claims(int id, String claimNum, String dateAccident, String descriptionAccident, String vehicleDamage,
            double repairCost) {
        this.id = id;
        this.claimNum = claimNum;
        this.dateAccident = dateAccident;
        this.descriptionAccident = descriptionAccident;
        this.vehicleDamage = vehicleDamage;
        this.repairCost = repairCost;
    }

    public Claims(String dateAccident, String descriptionAccident, String vehicleDamage, double repairCost) {
        this.dateAccident = dateAccident;
        this.descriptionAccident = descriptionAccident;
        this.vehicleDamage = vehicleDamage;
        this.repairCost = repairCost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClaimNum() {
        return claimNum;
    }

    public void setClaimNum(String claimNum) {
        this.claimNum = claimNum;
    }

    public String getDateAccident() {
        return dateAccident;
    }

    public void setDateAccident(String dateAccident) {
        this.dateAccident = dateAccident;
    }

    public String getDescriptionAccident() {
        return descriptionAccident;
    }

    public void setDescriptionAccident(String descriptionAccident) {
        this.descriptionAccident = descriptionAccident;
    }

    public String getVehicleDamage() {
        return vehicleDamage;
    }

    public void setVehicleDamage(String vehicleDamage) {
        this.vehicleDamage = vehicleDamage;
    }

    public double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

}
