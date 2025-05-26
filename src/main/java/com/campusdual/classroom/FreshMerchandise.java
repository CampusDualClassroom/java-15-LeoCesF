package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private final SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MM-yyyy");
    public Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date data) {
        return formattedDate.format(data);
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getSpecificData() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Localizacion: " + getLocation() + "\n");
        strBuilder.append("Fecha: " + getFormattedDate(this.expirationDate) + "\n");
        return strBuilder.toString();
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
