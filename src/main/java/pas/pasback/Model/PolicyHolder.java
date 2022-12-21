package pas.pasback.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PolicyHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String polHolderFname;
    private String polHolderLname;
    private String adress;
    private String licenseNum;
    private String licenseDate;

    public PolicyHolder() {
    }

    public PolicyHolder(int id, String polHolderFname, String polHolderLname, String adress, String licenseNum,
            String licenseDate) {
        this.id = id;
        this.polHolderFname = polHolderFname;
        this.polHolderLname = polHolderLname;
        this.adress = adress;
        this.licenseNum = licenseNum;
        this.licenseDate = licenseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolHolderFname() {
        return polHolderFname;
    }

    public void setPolHolderFname(String polHolderFname) {
        this.polHolderFname = polHolderFname;
    }

    public String getPolHolderLname() {
        return polHolderLname;
    }

    public void setPolHolderLname(String polHolderLname) {
        this.polHolderLname = polHolderLname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(String licenseDate) {
        this.licenseDate = licenseDate;
    }

}
