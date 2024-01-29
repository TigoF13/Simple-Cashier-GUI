package cashier;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Sales extends Function{
    int arraySize = 100;

    String[] date;
    String[] username;
    String[] itemsName;
    String[] itemsPricePerQuantity;
    String[] itemsQuantity;
    double[] totalPrice;
    
    int newSalesID=-1;
    
    Sales() throws Exception{
        date = new String[arraySize];
        username = new String[arraySize];
        itemsName = new String[arraySize];
        itemsQuantity = new String[arraySize];
        itemsPricePerQuantity = new String[arraySize];
        totalPrice = new double[arraySize];

        File file = new File("../Sales.txt");
        if(file.createNewFile()){
            System.out.println("File created: " + file.getName());
        }

        Scanner fr = new Scanner(file);

        while(fr.hasNextLine()){
            this.newSalesID = fr.nextInt();
            this.date[newSalesID] = fr.next();
            this.username[newSalesID] = fr.next();
            this.itemsName[newSalesID] = fr.next();
            this.itemsPricePerQuantity[newSalesID] = fr.next();
            this.itemsQuantity[newSalesID] = fr.next();
            this.totalPrice[newSalesID] = fr.nextDouble();
        }

        fr.close();

    }

    void createSales(String date, String username, String itemsName, String itemsPricePerQuantity, String itemsQuantity, double totalPrice){
        this.newSalesID++;
        this.date[newSalesID] = date;
        this.username[newSalesID] = username;
        this.itemsName[newSalesID] = itemsName;
        this.itemsPricePerQuantity[newSalesID] = itemsPricePerQuantity;
        this.itemsQuantity[newSalesID] = itemsQuantity;
        this.totalPrice[newSalesID] = totalPrice;
    }

    String[] getSalesinfo(String date){
        String[] SalesInfo = new String[6];

        for(int i=0; i<this.newSalesID; i++){
            if(date.equals(this.username[i])){
                SalesInfo[0] = String.valueOf(i);
                SalesInfo[1] = this.username[i];
                SalesInfo[2] = this.itemsName[i];
                SalesInfo[3] = this.itemsPricePerQuantity[i];
                SalesInfo[4] = this.itemsQuantity[i];
                SalesInfo[5] = String.valueOf(this.totalPrice[i]);
                break;
            }
        }

        return SalesInfo;
    }

    void editSales(int SalesID, String date, String username, String itemsName, String itemsPricePerQuantity, String itemsQuantity){
        this.date[SalesID] = date;
        this.username[SalesID] = username;
        this.itemsName[SalesID] = itemsName;
        this.itemsPricePerQuantity[SalesID] = itemsPricePerQuantity;
        this.itemsQuantity[SalesID] = itemsQuantity;
    }

    void saveSalesInfo() throws Exception{
        File file = new File("../Sales.txt");
        
        if(file.createNewFile()){
            System.out.println("File created");
        }

        FileWriter fw = new FileWriter(file);
        fw.write(this.toString());
        fw.close();
    }

    void removeSales(int SalesID){
        String[] tempdate = new String[arraySize];
        String[] tempusername = new String[arraySize];
        String[] tempitemsName = new String[arraySize];
        String[] tempitemsPricePerQuantity = new String[arraySize];
        String[] tempitemsQuantity = new String[arraySize];
        double[] temptotalPrice = new double[arraySize];

        for(int i=0, j=0; i<=this.newSalesID; i++){
            if(i != SalesID){
                tempdate[j] = this.date[i];
                tempusername[j] = this.username[i];
                tempitemsName[j] = this.itemsName[i];
                tempitemsPricePerQuantity[j] = this.itemsPricePerQuantity[i];
                tempitemsQuantity[j] = this.itemsQuantity[i];
                temptotalPrice[j] = this.totalPrice[i];
                j++;
            }
        }

        this.newSalesID--;

        for(int i=0; i<=newSalesID; i++){
            this.date[i] = tempdate[i];
            this.username[i] = tempusername[i];
            this.itemsName[i] = tempitemsName[i];
            this.itemsPricePerQuantity[i] = tempitemsPricePerQuantity[i];
            this.itemsQuantity[i] = tempitemsQuantity[i];
            this.totalPrice[i] = temptotalPrice[i];
        }
    }

    boolean illegalUserTextInput(String text){
        return super.illegalUserTextInput(text);
    }

    @Override
    public String toString(){
        String info = "";

        for(int i=0; i<=this.newSalesID; i++){
            info += i + " " + this.date[i] + " " + this.username[i] + " " + this.itemsName[i] + " " + this.itemsPricePerQuantity[i] + " " + this.itemsQuantity[i] + " " + this.totalPrice[i];
            
            if(i != this.newSalesID){
                info += "\n";
            }
        }

        return info;
    }

}