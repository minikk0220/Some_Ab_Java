package SUN;


public class account {
    private String type;
    private double allMoney;
    private double thisMoney;
    private String description;
    private String createTime;

    public account(String type,double allMoney,double thisMoney,String description,String createTime){
        super();
        this.type = type;
        this.allMoney = allMoney;
        this.thisMoney = thisMoney;
        this.description = description;
        this.createTime = createTime;
    }
    public account(){
        super();
    }

    public String getType(){return type;}
    public double getAllMoney(){return allMoney;}
    public double getThisMoney(){return thisMoney;}
    public String getDescription(){return description;}
    public String getCreateTime(){return createTime;}

    public void setType(String t){type = t;}
    public void setAllMoney(double am){allMoney = am;}
    public void setThisMoney(double tm){thisMoney = tm;}
    public void setDescription(String des){description = des;}
    public void setCreateTime(String cre){createTime = cre;}

    public String toString(){
        return type+"\t\t"+allMoney+"\t\t"+thisMoney+"\t\t"+description+"\t\t"+createTime;
    }
}
